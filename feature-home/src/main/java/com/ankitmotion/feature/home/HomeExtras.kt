package com.ankitmotion.feature.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ankitmotion.core.model.NewProjectRequest

private data class Template(val name: String, val desc: String, val width: Int, val height: Int, val fps: Int)

private val templates = listOf(
    Template("Vertical story", "9:16 · 30 fps", 1080, 1920, 30),
    Template("Square post", "1:1 · 30 fps", 1080, 1080, 30),
    Template("Widescreen", "16:9 · 60 fps", 1920, 1080, 60)
)

@Composable
internal fun TemplatesTab(onCreateProject: (NewProjectRequest) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(templates, key = { it.name }) { template ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onCreateProject(
                            NewProjectRequest(template.name, template.width, template.height, template.fps)
                        )
                    }
            ) {
                Column(Modifier.padding(16.dp)) {
                    Text(template.name, fontWeight = FontWeight.Bold)
                    Text(
                        template.desc,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
internal fun MediaTab() {
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Media browser", style = MaterialTheme.typography.titleLarge)
        Text(
            "Photos, videos, audio aur fonts editor ke Add menu se device se direct pick kar sakte hain. " +
                "Koi upload nahi — sab kuch local hai."
        )
        Text(
            "Kisi project ko open karein → Layers panel me '+ Media', 'Audio', 'Draw' ya 'FX' dabayein.",
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@Composable
internal fun SettingsTab() {
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences("ankit_settings", 0) }
    val fps = remember { mutableStateOf(prefs.getInt("default_fps", 30)) }
    val quality = remember { mutableStateOf(prefs.getString("export_quality", "1080p") ?: "1080p") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Settings · local only", style = MaterialTheme.typography.titleLarge)
        Text("Default frame rate")
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            listOf(30, 60).forEach { option ->
                FilterChip(
                    selected = fps.value == option,
                    onClick = {
                        fps.value = option
                        prefs.edit().putInt("default_fps", option).apply()
                    },
                    label = { Text("$option fps") }
                )
            }
        }
        Text("Export quality")
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            listOf("720p", "1080p", "4K").forEach { option ->
                FilterChip(
                    selected = quality.value == option,
                    onClick = {
                        quality.value = option
                        prefs.edit().putString("export_quality", option).apply()
                    },
                    label = { Text(option) }
                )
            }
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Cloud", modifier = Modifier.weight(1f))
            Text("Disabled by design", color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
        TextButton(onClick = {
            prefs.edit().clear().apply()
            fps.value = 30
            quality.value = "1080p"
        }) { Text("Reset settings") }
    }
}
