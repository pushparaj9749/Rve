package com.ankitmotion.feature.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ankitmotion.core.model.NewProjectRequest
import com.ankitmotion.core.model.ProjectMeta
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

private val tabs = listOf("Projects", "Templates", "Media", "Settings")
private val ratios = listOf(
    Triple("9:16", 1080, 1920),
    Triple("16:9", 1920, 1080),
    Triple("1:1", 1080, 1080)
)
private val fpsOptions = listOf(30, 60)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    projects: List<ProjectMeta>,
    onOpenProject: (String) -> Unit,
    onCreateProject: (NewProjectRequest) -> Unit,
    modifier: Modifier = Modifier
) {
    val selectedTab = remember { mutableStateOf(0) }
    val showCreateDialog = remember { mutableStateOf(false) }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(title = { Text("Ankit motion+") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { showCreateDialog.value = true }) {
                Icon(Icons.Filled.Add, contentDescription = "New project")
            }
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).fillMaxSize()) {
            TabRow(selectedTabIndex = selectedTab.value) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab.value == index,
                        onClick = { selectedTab.value = index },
                        text = { Text(title) }
                    )
                }
            }

            when (selectedTab.value) {
                0 -> ProjectList(projects, onOpenProject)
                1 -> TemplatesTab(onCreateProject)
                2 -> MediaTab()
                3 -> SettingsTab()
                else -> Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(tabs[selectedTab.value])
                }
            }
        }
    }

    if (showCreateDialog.value) {
        NewProjectDialog(
            onDismiss = { showCreateDialog.value = false },
            onCreate = { request ->
                onCreateProject(request)
                showCreateDialog.value = false
            }
        )
    }
}

@Composable
private fun ProjectList(projects: List<ProjectMeta>, onOpen: (String) -> Unit) {
    if (projects.isEmpty()) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Abhi koi project nahi — + dabakar naya project banao")
        }
        return
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(projects, key = { it.id }) { project ->
            Card(modifier = Modifier.fillMaxWidth().clickable { onOpen(project.id) }) {
                Column(Modifier.padding(16.dp)) {
                    Text(project.title, fontWeight = FontWeight.Bold)
                    Text(
                        "${project.width}x${project.height} · ${project.fps} fps",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Text(
                        "Edited ${formatDate(project.modifiedAt)}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
private fun NewProjectDialog(
    onDismiss: () -> Unit,
    onCreate: (NewProjectRequest) -> Unit
) {
    val title = remember { mutableStateOf("My Motion") }
    val ratioIndex = remember { mutableStateOf(0) }
    val fpsIndex = remember { mutableStateOf(0) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Naya project") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                OutlinedTextField(
                    value = title.value,
                    onValueChange = { title.value = it },
                    label = { Text("Project name") },
                    singleLine = true
                )
                Text("Aspect ratio", style = MaterialTheme.typography.labelLarge)
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ratios.forEachIndexed { index, ratio ->
                        FilterChip(
                            selected = ratioIndex.value == index,
                            onClick = { ratioIndex.value = index },
                            label = { Text(ratio.first) }
                        )
                    }
                }
                Text("Frame rate", style = MaterialTheme.typography.labelLarge)
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    fpsOptions.forEachIndexed { index, fps ->
                        FilterChip(
                            selected = fpsIndex.value == index,
                            onClick = { fpsIndex.value = index },
                            label = { Text("$fps fps") }
                        )
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = {
                val ratio = ratios[ratioIndex.value]
                onCreate(NewProjectRequest(title.value, ratio.second, ratio.third, fpsOptions[fpsIndex.value]))
            }) { Text("Create") }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } }
    )
}

private fun formatDate(timestamp: Long): String =
    SimpleDateFormat("dd MMM, HH:mm", Locale.getDefault()).format(Date(timestamp))
