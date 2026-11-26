package com.ankitmotion.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ankitmotion.core.model.NewProjectRequest
import com.ankitmotion.core.model.ProjectMeta
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

private val headerColor = Color(0xFF111A2E)
private val accentColor = Color(0xFF4DA3FF)
private val tabLabels = listOf("Home", "Projects", "My Elements")

/**
 * Launch screen layout follows the reverse-engineered reference:
 * fixed header with logo and drawer button, three pager tabs, page content,
 * and a single add button anchored to the bottom right.
 */
@Composable
fun HomeScreen(
    projects: List<ProjectMeta>,
    onOpenProject: (String) -> Unit,
    onCreateProject: (NewProjectRequest) -> Unit,
    modifier: Modifier = Modifier
) {
    val selectedTab = remember { mutableStateOf(0) }
    val showCreate = remember { mutableStateOf(false) }
    val showDrawer = remember { mutableStateOf(false) }
    val drawerPage = remember { mutableStateOf<String?>(null) }

    Box(modifier = modifier.fillMaxSize().background(Color.White)) {
        Column(Modifier.fillMaxSize()) {
            // Header: 140dp like the reference project-list header.
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .background(headerColor)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().height(92.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { showDrawer.value = true }) {
                        Icon(Icons.Filled.Menu, contentDescription = "Menu", tint = Color.White)
                    }
                    Text(
                        text = "Ankit motion+",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(1f),
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )
                    IconButton(onClick = { drawerPage.value = "Account" }) {
                        Icon(Icons.Filled.AccountCircle, contentDescription = "Account", tint = Color.White)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth().height(48.dp)) {
                    tabLabels.forEachIndexed { index, label ->
                        val selected = selectedTab.value == index
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxSize()
                                .clickable { selectedTab.value = index },
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = when (index) {
                                    0 -> Icons.Filled.Dashboard
                                    1 -> Icons.Filled.Folder
                                    else -> Icons.Filled.Movie
                                },
                                contentDescription = null,
                                tint = if (selected) accentColor else Color.White,
                                modifier = Modifier.size(22.dp)
                            )
                            Text(
                                text = label,
                                color = if (selected) accentColor else Color.White,
                                fontSize = 10.sp
                            )
                            Box(
                                modifier = Modifier
                                    .width(48.dp)
                                    .height(2.dp)
                                    .background(if (selected) accentColor else Color.Transparent)
                            )
                        }
                    }
                }
            }

            Box(modifier = Modifier.weight(1f).fillMaxWidth()) {
                when (selectedTab.value) {
                    0 -> TemplatesTab(onCreateProject)
                    1 -> ProjectList(projects, onOpenProject)
                    2 -> MyElementsTab()
                }
            }
        }

        if (selectedTab.value != 0) {
            FloatingActionButton(
                onClick = { showCreate.value = true },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp),
                containerColor = accentColor,
                contentColor = Color.Black
            ) {
                Icon(Icons.Filled.Add, contentDescription = "New project")
            }
        }

        if (showCreate.value) {
            CreateProjectScreen(
                onClose = { showCreate.value = false },
                onCreate = { request ->
                    onCreateProject(request)
                    showCreate.value = false
                }
            )
        }

        if (showDrawer.value) {
            Box(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.5f))
                        .clickable { showDrawer.value = false }
                )
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(260.dp)
                        .background(headerColor)
                        .padding(top = 24.dp)
                ) {
                    Text(
                        "Ankit motion+",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                    listOf("Settings", "About", "Tutorial", "Open source libraries", "Privacy policy", "Terms of service")
                        .forEach { item ->
                            TextButton(onClick = {
                                showDrawer.value = false
                                drawerPage.value = item
                            }) {
                                Text(item, color = Color.White)
                            }
                        }
                }
            }
        }

        drawerPage.value?.let { page ->
            val body = when (page) {
                "Settings" -> "Local-only editor. All projects, media and exports stay on this device."
                "About" -> "Ankit motion+ — a clean-room local motion and video editor."
                "Tutorial" -> "Create a project, add media from the Add menu, move the playhead, add keyframes, then export to your device."
                "Account" -> "Accounts and cloud sync are disabled in this local build."
                "Open source libraries" -> "Built with Kotlin, Jetpack Compose, Room and Media3."
                "Privacy policy" -> "No internet permission. No uploads, no analytics, no accounts."
                else -> "This build is offline and local only."
            }
            AlertDialog(
                onDismissRequest = { drawerPage.value = null },
                title = { Text(page) },
                text = { Text(body) },
                confirmButton = { TextButton(onClick = { drawerPage.value = null }) { Text("OK") } }
            )
        }
    }
}

@Composable
private fun ProjectList(projects: List<ProjectMeta>, onOpen: (String) -> Unit) {
    if (projects.isEmpty()) {
        Box(
            modifier = Modifier.fillMaxSize().padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("No projects yet. Tap + to create one.", color = Color(0xFF5F6B82))
        }
        return
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(horizontal = 12.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(projects, key = { it.id }) { project ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onOpen(project.id) }
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .background(headerColor),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Filled.Movie, contentDescription = null, tint = accentColor)
                    }
                    Spacer(Modifier.padding(horizontal = 8.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(project.title, fontWeight = FontWeight.Bold, maxLines = 1)
                        Text(
                            "${project.width} x ${project.height}  ·  ${project.fps} fps",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFF5F6B82)
                        )
                        Text(
                            "Edited ${formatDate(project.modifiedAt)}",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFF8492AC)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun MyElementsTab() {
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("My Elements", style = MaterialTheme.typography.titleLarge)
        Text("Media, audio and fonts are picked locally from the device inside the editor.")
        Text(
            "Open a project and use the Add menu to import photos, videos, audio, shapes, text or drawings.",
            color = Color(0xFF5F6B82)
        )
    }
}

/** Full-screen creation page mirroring the reference Create Project layout. */
@Composable
private fun CreateProjectScreen(
    onClose: () -> Unit,
    onCreate: (NewProjectRequest) -> Unit
) {
    val projectMode = remember { mutableStateOf(0) }
    val title = remember { mutableStateOf("") }
    val ratioIndex = remember { mutableStateOf(0) }
    val width = remember { mutableStateOf("1920") }
    val height = remember { mutableStateOf("1080") }
    val fpsIndex = remember { mutableStateOf(2) }
    val ratios = listOf("16:9", "9:16", "4:5", "1:1", "4:3", "Custom")
    val ratioSizes = listOf(1920 to 1080, 1080 to 1920, 1080 to 1350, 1080 to 1080, 1440 to 1080)
    val fpsOptions = listOf(24, 25, 30, 60)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(headerColor)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            TextButton(onClick = onClose) { Text("✕", color = Color.White, fontSize = 20.sp) }
            Text("New Project", color = Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f))
        }
        Row(
            modifier = Modifier.fillMaxWidth().height(44.dp).background(Color(0xFF1B2740)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            listOf("Project", "Element").forEachIndexed { index, label ->
                TextButton(
                    onClick = { projectMode.value = index },
                    modifier = Modifier.weight(1f)
                ) {
                    Text(label, color = if (projectMode.value == index) accentColor else Color.White)
                }
            }
        }
        OutlinedTextField(
            value = title.value,
            onValueChange = { title.value = it },
            label = { Text("Project title") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            ratios.forEachIndexed { index, label ->
                TextButton(
                    onClick = {
                        ratioIndex.value = index
                        if (index < ratioSizes.size) {
                            width.value = ratioSizes[index].first.toString()
                            height.value = ratioSizes[index].second.toString()
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Text(label, color = if (ratioIndex.value == index) accentColor else Color.White, fontSize = 11.sp)
                }
            }
        }
        Text("Resolution", color = Color.White, modifier = Modifier.fillMaxWidth())
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedTextField(
                value = width.value,
                onValueChange = { width.value = it.filter { c -> c.isDigit() } },
                label = { Text("Width") },
                modifier = Modifier.weight(1f),
                singleLine = true
            )
            OutlinedTextField(
                value = height.value,
                onValueChange = { height.value = it.filter { c -> c.isDigit() } },
                label = { Text("Height") },
                modifier = Modifier.weight(1f),
                singleLine = true
            )
        }
        Text("Frame rate", color = Color.White, modifier = Modifier.fillMaxWidth())
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            fpsOptions.forEachIndexed { index, fps ->
                TextButton(
                    onClick = { fpsIndex.value = index },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("$fps", color = if (fpsIndex.value == index) accentColor else Color.White)
                }
            }
        }
        Text("Background: Black", color = Color.White, modifier = Modifier.fillMaxWidth())
        Spacer(Modifier.weight(1f))
        TextButton(onClick = {
            val w = width.value.toIntOrNull()?.coerceIn(64, 4096) ?: 1920
            val h = height.value.toIntOrNull()?.coerceIn(64, 4096) ?: 1080
            onCreate(
                NewProjectRequest(
                    title = title.value.ifBlank { "Untitled ${System.currentTimeMillis() / 1000}" },
                    width = w,
                    height = h,
                    fps = fpsOptions[fpsIndex.value]
                )
            )
        }) {
            Text("Create Project", color = accentColor, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }
    }
}

private fun formatDate(timestamp: Long): String =
    SimpleDateFormat("dd MMM, HH:mm", Locale.getDefault()).format(Date(timestamp))
