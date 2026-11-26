package com.ankitmotion.feature.reverse

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ankitmotion.core.model.ReverseSettings

@Composable
fun ReversePanel(
    settings: ReverseSettings,
    onChange: (ReverseSettings) -> Unit,
    onApply: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth().padding(8.dp)) {
        Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text("Video reverse", style = MaterialTheme.typography.titleMedium)
            ToggleRow("Reverse video", settings.reverseVideo) {
                onChange(settings.copy(reverseVideo = it))
            }
            ToggleRow("Reverse audio", settings.reverseAudio) {
                onChange(settings.copy(reverseAudio = it))
            }
            ToggleRow("Keep duration", settings.preserveDuration) {
                onChange(settings.copy(preserveDuration = it))
            }
            Button(onClick = onApply, modifier = Modifier.fillMaxWidth()) {
                Text("Apply reverse")
            }
        }
    }
}

@Composable
private fun ToggleRow(label: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(label)
        Switch(checked = checked, onCheckedChange = onCheckedChange)
    }
}
