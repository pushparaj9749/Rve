package com.ankitmotion.feature.reverse

import android.content.Context
import android.net.Uri
import com.ankitmotion.core.model.ReverseSettings
import com.hw.videoprocessor.VideoProcessor
import com.hw.videoprocessor.util.VideoProgressListener
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File

/**
 * Local-only reverse processor.
 *
 * Uses VideoProcessor (Apache-2.0) at build time only — everything runs on-device.
 * No upload, no network permission.
 */
object ReverseProcessor {

    suspend fun reverse(
        context: Context,
        inputUri: Uri,
        settings: ReverseSettings,
        onProgress: (Float) -> Unit
    ): File = withContext(Dispatchers.IO) {
        val outputDir = File(context.filesDir, "reversed").apply { mkdirs() }
        val output = File(outputDir, "reversed_${System.currentTimeMillis()}.mp4")

        VideoProcessor.reverseVideo(
            context,
            VideoProcessor.MediaSource(context, inputUri),
            output.absolutePath,
            settings.reverseAudio,
            VideoProgressListener { progress -> onProgress(progress.coerceIn(0f, 1f)) }
        )

        if (!output.exists() || output.length() < 1_000L) {
            throw IllegalStateException("Reverse output was not created")
        }
        output
    }
}
