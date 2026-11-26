package com.ankitmotion.feature.editor

import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ankitmotion.feature.editor.media.MediaThumbnail
import com.ankitmotion.feature.editor.media.PickedMedia

/** Shows picked photos/videos and lets the user choose which become layers. */
@Composable
internal fun MediaPickerDialog(
    items: List<PickedMedia>,
    onDismiss: () -> Unit,
    onConfirm: (List<PickedMedia>) -> Unit
) {
    val selected = remember(items) {
        mutableStateListOf<Uri>().apply { addAll(items.map { it.uri }) }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Add media · ${items.size} found") },
        text = {
            LazyColumn(
                modifier = Modifier.heightIn(max = 380.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                items(items, key = { it.uri.toString() }) { media ->
                    val checked = media.uri in selected
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                if (checked) selected.remove(media.uri) else selected.add(media.uri)
                            }
                            .background(
                                if (checked) MaterialTheme.colorScheme.primary.copy(alpha = 0.10f)
                                else Color.Transparent
                            )
                            .padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(56.dp)
                                .clip(MaterialTheme.shapes.small)
                        ) {
                            MediaThumbnail(
                                uri = media.uri.toString(),
                                isVideo = media.isVideo,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(horizontal = 10.dp)
                        ) {
                            Text(
                                media.name,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Text(
                                text = if (media.isVideo) {
                                    "Video · ${media.durationMs ?: 0} ms · ${media.width}x${media.height}"
                                } else {
                                    "Image · ${media.width}x${media.height}"
                                },
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Checkbox(
                            checked = checked,
                            onCheckedChange = {
                                if (it) selected.add(media.uri) else selected.remove(media.uri)
                            }
                        )
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = { onConfirm(items.filter { it.uri in selected }) }) {
                Text("Add selected")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) { Text("Cancel") }
        }
    )
}
