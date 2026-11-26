package com.ankitmotion.feature.editor.media

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/** Thumbnail for an image or the first frame of a video. */
@Composable
fun MediaThumbnail(
    uri: String?,
    isVideo: Boolean,
    modifier: Modifier = Modifier,
    colorFilter: ColorFilter? = null
) {
    val context = LocalContext.current
    val bitmapState = remember { mutableStateOf<android.graphics.Bitmap?>(null) }

    LaunchedEffect(uri) {
        if (uri == null) {
            bitmapState.value = null
        } else {
            val parsed = runCatching { android.net.Uri.parse(uri) }.getOrNull()
            bitmapState.value = parsed?.let { target ->
                withContext(Dispatchers.IO) {
                    MediaLoader.thumbnail(context, PickedMedia(target, "", isVideo, null, 0, 0))
                }
            }
        }
    }

    val bitmap = bitmapState.value
    if (bitmap != null) {
        Image(
            bitmap = bitmap.asImageBitmap(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            colorFilter = colorFilter,
            modifier = modifier
        )
    } else {
        Box(modifier = modifier, contentAlignment = Alignment.Center) {
            Text(if (isVideo) "VIDEO" else "No media")
        }
    }
}
