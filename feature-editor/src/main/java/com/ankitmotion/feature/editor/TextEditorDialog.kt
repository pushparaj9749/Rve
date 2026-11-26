package com.ankitmotion.feature.editor

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ankitmotion.core.model.StyledText
import com.ankitmotion.core.model.TextAlign

@Composable
internal fun TextEditorDialog(
    initial: StyledText,
    onDismiss: () -> Unit,
    onSave: (StyledText) -> Unit
) {
    val text = remember { mutableStateOf(initial.text) }
    val size = remember { mutableStateOf(initial.fontSize) }
    val color = remember { mutableStateOf(initial.color) }
    val font = remember { mutableStateOf(initial.font) }
    val bold = remember { mutableStateOf(initial.bold) }
    val italic = remember { mutableStateOf(initial.italic) }
    val align = remember { mutableStateOf(initial.align) }
    val fonts = listOf("System", "Serif", "Sans", "Monospace")

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Text layer") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(
                    value = text.value,
                    onValueChange = { text.value = it },
                    label = { Text("Text") },
                    modifier = Modifier.fillMaxWidth()
                )
                OutlinedTextField(
                    value = color.value,
                    onValueChange = { color.value = it },
                    label = { Text("Color (#RRGGBB)") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                Text("Size ${size.value.toInt()}px")
                Slider(
                    value = size.value,
                    valueRange = 12f..180f,
                    onValueChange = { size.value = it }
                )
                Text("Font", style = MaterialTheme.typography.labelLarge)
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    fonts.forEach { option ->
                        FilterChip(
                            selected = font.value == option,
                            onClick = { font.value = option },
                            label = { Text(option) }
                        )
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    FilterChip(selected = bold.value, onClick = { bold.value = !bold.value }, label = { Text("B") })
                    FilterChip(selected = italic.value, onClick = { italic.value = !italic.value }, label = { Text("I") })
                    TextAlign.entries.forEach { option ->
                        FilterChip(
                            selected = align.value == option,
                            onClick = { align.value = option },
                            label = { Text(option.name.take(3)) }
                        )
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = {
                onSave(
                    StyledText(
                        text = text.value,
                        font = font.value,
                        fontSize = size.value,
                        color = color.value,
                        bold = bold.value,
                        italic = italic.value,
                        align = align.value
                    )
                )
            }) { Text("Save") }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } }
    )
}
