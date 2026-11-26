package com.ankitmotion.feature.editor

import android.Manifest
import android.content.Context
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.FileProvider
import java.io.File

/** Camera capture → IMAGE layer. Uses only system camera app, no network. */
@Composable
internal fun CameraCaptureDialog(
    onDismiss: () -> Unit,
    onCaptured: (Uri) -> Unit
) {
    val context = LocalContext.current
    val photoUri = remember { createPhotoUri(context) }
    val takePicture: ActivityResultLauncher<Uri> =
        rememberLauncherForActivityResult(ActivityResultContracts.TakePicture()) { saved ->
            if (saved) onCaptured(photoUri)
        }
    val requestPermission = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (granted) takePicture.launch(photoUri)
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Camera layer") },
        text = { Text("Device camera se photo capture karke image layer banayega.") },
        confirmButton = {
            TextButton(onClick = { requestPermission.launch(Manifest.permission.CAMERA) }) {
                Text("Open camera")
            }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } }
    )
}

private fun createPhotoUri(context: Context): Uri {
    val directory = File(context.filesDir, "camera").apply { mkdirs() }
    val file = File(directory, "capture_${System.currentTimeMillis()}.jpg")
    return FileProvider.getUriForFile(context, "${context.packageName}.fileprovider", file)
}
