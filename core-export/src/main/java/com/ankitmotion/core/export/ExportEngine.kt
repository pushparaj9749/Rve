package com.ankitmotion.core.export

import android.content.ContentValues
import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import androidx.annotation.OptIn
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.common.util.UnstableApi
import androidx.media3.transformer.Composition
import androidx.media3.transformer.EditedMediaItem
import androidx.media3.transformer.EditedMediaItemSequence
import androidx.media3.transformer.ExportException
import androidx.media3.transformer.ExportResult
import androidx.media3.transformer.ProgressHolder
import androidx.media3.transformer.Transformer
import com.ankitmotion.core.model.ElementType
import com.ankitmotion.core.model.Scene
import kotlinx.coroutines.suspendCancellableCoroutine
import java.io.File
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

/** Media3 Transformer export — preview and export share the same clip list. */
object ExportEngine {

    @OptIn(UnstableApi::class)
    suspend fun export(
        context: Context,
        scene: Scene,
        outputFile: File,
        onProgress: (Float) -> Unit
    ): File = suspendCancellableCoroutine { continuation ->
        if (outputFile.exists()) outputFile.delete()

        val editedItems = scene.elements
            .asSequence()
            .filter { it.sourceUri != null }
            .filter { it.type == ElementType.IMAGE || it.type == ElementType.VIDEO }
            .sortedBy { it.startMs }
            .map { element ->
                val uri = Uri.parse(element.sourceUri)
                val lengthMs = (element.endMs - element.startMs).coerceAtLeast(200L)
                val mediaItem = if (element.type == ElementType.IMAGE) {
                    MediaItem.Builder().setUri(uri).setImageDurationMs(lengthMs).build()
                } else {
                    MediaItem.Builder()
                        .setUri(uri)
                        .setClippingConfiguration(
                            MediaItem.ClippingConfiguration.Builder()
                                .setStartPositionMs(element.startMs)
                                .setEndPositionMs(element.endMs)
                                .build()
                        )
                        .build()
                }
                EditedMediaItem.Builder(mediaItem)
                    .setFrameRate(scene.fps)
                    .setRemoveAudio(element.type == ElementType.IMAGE)
                    .build()
            }
            .toList()

        if (editedItems.isEmpty()) {
            continuation.resumeWithException(IllegalStateException("Add an image or video layer first"))
            return@suspendCancellableCoroutine
        }

        val composition = Composition.Builder(EditedMediaItemSequence(editedItems)).build()
        val handler = Handler(Looper.getMainLooper())
        var progressRunnable: Runnable? = null

        val transformer = try {
            Transformer.Builder(context)
                .setVideoMimeType(MimeTypes.VIDEO_H264)
                .setAudioMimeType(MimeTypes.AUDIO_AAC)
                .addListener(object : Transformer.Listener {
                    override fun onCompleted(composition: Composition, result: ExportResult) {
                        progressRunnable?.let { handler.removeCallbacks(it) }
                        if (continuation.isActive) continuation.resume(outputFile)
                    }

                    override fun onError(
                        composition: Composition,
                        result: ExportResult,
                        exception: ExportException
                    ) {
                        progressRunnable?.let { handler.removeCallbacks(it) }
                        if (continuation.isActive) continuation.resumeWithException(exception)
                    }
                })
                .build()
        } catch (error: Throwable) {
            continuation.resumeWithException(error)
            return@suspendCancellableCoroutine
        }

        val holder = ProgressHolder()
        val poll = object : Runnable {
            override fun run() {
                when (transformer.getProgress(holder)) {
                    Transformer.PROGRESS_STATE_AVAILABLE -> onProgress(holder.progress / 100f)
                    Transformer.PROGRESS_STATE_WAITING_FOR_AVAILABILITY -> onProgress(0f)
                    else -> Unit
                }
                if (continuation.isActive) handler.postDelayed(this, 250L)
            }
        }
        progressRunnable = poll
        handler.post(poll)

        continuation.invokeOnCancellation {
            handler.removeCallbacks(poll)
            transformer.cancel()
        }

        transformer.start(composition, outputFile.absolutePath)
    }

    fun createOutputFile(context: Context): File {
        val dir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES)
            ?: File(context.filesDir, "exports").apply { mkdirs() }
        return File(dir, "AnkitMotion_${System.currentTimeMillis()}.mp4")
    }

    /** Optional copy into the shared Movies folder (still 100% local). */
    fun publishToGallery(context: Context, file: File): Uri? {
        val values = ContentValues().apply {
            put(MediaStore.Video.Media.DISPLAY_NAME, file.name)
            put(MediaStore.Video.Media.MIME_TYPE, "video/mp4")
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                put(MediaStore.Video.Media.RELATIVE_PATH, "${Environment.DIRECTORY_MOVIES}/Ankit motion+")
            }
        }
        val resolver = context.contentResolver
        val uri = resolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, values) ?: return null
        resolver.openOutputStream(uri)?.use { output ->
            file.inputStream().use { it.copyTo(output) }
        }
        return uri
    }
}
