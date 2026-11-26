package com.ankitmotion.feature.editor.media

import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.provider.OpenableColumns
import java.io.IOException

/** Info about one media file picked from the device gallery. */
data class PickedMedia(
    val uri: Uri,
    val name: String,
    val isVideo: Boolean,
    val durationMs: Long?,
    val width: Int,
    val height: Int
)

/** Reads metadata + thumbnails from content:// URIs. Nothing leaves the device. */
object MediaLoader {

    fun describe(context: Context, uri: Uri): PickedMedia {
        takeReadPermission(context, uri)

        val mime = runCatching { context.contentResolver.getType(uri) }.getOrNull().orEmpty()
        val path = uri.lastPathSegment.orEmpty()
        val isVideo = mime.startsWith("video/") ||
            listOf(".mp4", ".mov", ".mkv", ".webm", ".3gp").any { path.endsWith(it, ignoreCase = true) }

        var durationMs: Long? = null
        var width = 0
        var height = 0

        if (isVideo) {
            val retriever = MediaMetadataRetriever()
            try {
                retriever.setDataSource(context, uri)
                durationMs = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)?.toLongOrNull()
                width = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_VIDEO_WIDTH)?.toIntOrNull() ?: 0
                height = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_VIDEO_HEIGHT)?.toIntOrNull() ?: 0
            } catch (_: Exception) {
                // Broken/unsupported file — still show it, editor will skip it on export.
            } finally {
                @Suppress("DEPRECATION")
                retriever.release()
            }
        } else {
            val bounds = BitmapFactory.Options().apply { inJustDecodeBounds = true }
            try {
                context.contentResolver.openInputStream(uri)?.use { input ->
                    BitmapFactory.decodeStream(input, null, bounds)
                }
            } catch (_: IOException) {
                // Ignore, dimensions are optional.
            }
            width = bounds.outWidth
            height = bounds.outHeight
        }

        return PickedMedia(
            uri = uri,
            name = displayName(context, uri),
            isVideo = isVideo,
            durationMs = durationMs,
            width = width,
            height = height
        )
    }

    fun thumbnail(context: Context, media: PickedMedia): Bitmap? {
        return if (media.isVideo) {
            val retriever = MediaMetadataRetriever()
            try {
                retriever.setDataSource(context, media.uri)
                retriever.getFrameAtTime(0L, MediaMetadataRetriever.OPTION_CLOSEST_SYNC)
            } catch (_: Exception) {
                null
            } finally {
                @Suppress("DEPRECATION")
                retriever.release()
            }
        } else {
            try {
                context.contentResolver.openInputStream(media.uri)?.use { input ->
                    BitmapFactory.decodeStream(input)
                }
            } catch (_: IOException) {
                null
            }
        }
    }

    private fun takeReadPermission(context: Context, uri: Uri) {
        try {
            context.contentResolver.takePersistableUriPermission(
                uri,
                Intent.FLAG_GRANT_READ_URI_PERMISSION
            )
        } catch (_: SecurityException) {
            // Photo Picker URIs are usually temporary; in-app session still works.
        }
    }

    private fun displayName(context: Context, uri: Uri): String {
        val projection = arrayOf(OpenableColumns.DISPLAY_NAME)
        val cursor: Cursor? = try {
            context.contentResolver.query(uri, projection, null, null, null)
        } catch (_: SecurityException) {
            null
        }
        cursor?.use { c ->
            val index = c.getColumnIndex(OpenableColumns.DISPLAY_NAME)
            if (index >= 0 && c.moveToFirst()) {
                val name = c.getString(index)
                if (!name.isNullOrBlank()) return name
            }
        }
        return uri.lastPathSegment?.substringAfterLast('/') ?: "Media"
    }
}
