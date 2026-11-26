package com.ankitmotion.feature.editor

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ankitmotion.core.effect.EffectRegistry

/** Searchable effect browser — same idea as the reference app's EffectBrowserActivity. */
@Composable
internal fun EffectBrowserDialog(
    onDismiss: () -> Unit,
    onPick: (String) -> Unit
) {
    val query = remember { mutableStateOf("") }
    val all = remember { EffectRegistry.all() }
    val categories = remember(query.value) {
        all.filter { effect ->
            query.value.isBlank() ||
                effect.name.contains(query.value, ignoreCase = true) ||
                effect.category.contains(query.value, ignoreCase = true) ||
                effect.tags.any { it.contains(query.value, ignoreCase = true) }
        }.groupBy { it.category }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Effects · ${all.size}") },
        text = {
            Column {
                OutlinedTextField(
                    value = query.value,
                    onValueChange = { query.value = it },
                    label = { Text("Search effects") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                LazyColumn(
                    modifier = Modifier.heightIn(max = 420.dp).padding(top = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    categories.forEach { (category, effects) ->
                        item(key = "header_$category") {
                            Text(
                                category,
                                fontWeight = FontWeight.Bold,
                                style = MaterialTheme.typography.labelLarge,
                                modifier = Modifier.padding(vertical = 4.dp)
                            )
                        }
                        items(effects, key = { it.id }) { effect ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { onPick(effect.id) }
                                    .padding(8.dp)
                            ) {
                                Column {
                                    Text(effect.name, style = MaterialTheme.typography.bodyMedium)
                                    Text(
                                        effect.description,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }
                        }
                    }
                }
            }
        },
        confirmButton = { TextButton(onClick = onDismiss) { Text("Close") } }
    )
}
