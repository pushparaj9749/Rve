package com.ankitmotion.feature.editor

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Audiotrack
import androidx.compose.material.icons.filled.Brush
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.CropSquare
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.GroupWork
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Redo
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material.icons.filled.TextFields
import androidx.compose.material.icons.filled.Undo
import androidx.compose.material.icons.filled.Widgets
import androidx.compose.material.icons.filled.ZoomIn
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ankitmotion.core.effect.EffectRegistry
import com.ankitmotion.core.model.BlendingMode
import com.ankitmotion.core.model.DrawingPath
import com.ankitmotion.core.model.Easing
import com.ankitmotion.core.model.ElementType
import com.ankitmotion.core.model.KeyableFloat
import com.ankitmotion.core.model.Keyframe
import com.ankitmotion.core.model.KeyframeEvaluator
import com.ankitmotion.core.model.OperationProgress
import com.ankitmotion.core.model.ParameterType
import com.ankitmotion.core.model.ProjectMeta
import com.ankitmotion.core.model.ReverseSettings
import com.ankitmotion.core.model.Scene
import com.ankitmotion.core.model.SceneElement
import com.ankitmotion.core.model.ShapeKind
import com.ankitmotion.core.model.SpeedPoint
import com.ankitmotion.core.model.StyledText
import com.ankitmotion.feature.editor.media.MediaLoader
import com.ankitmotion.feature.editor.media.MediaThumbnail
import com.ankitmotion.feature.editor.media.PickedMedia
import com.ankitmotion.feature.reverse.ReversePanel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

private val editorBg = Color(0xFF101014)
private val chromeBg = Color(0xFF1B1B21)
private val timelineBg = Color(0xFF15151A)
private val accent = Color(0xFFF5C518)

private fun currentDuration(elements: List<SceneElement>, scene: Scene?): Long =
    scene?.durationMs?.coerceAtLeast(500L) ?: 2_000L

/**
 * Editor shell follows the reverse-engineered reference layout:
 * 42dp project bar, canvas with a 50dp tool rail, info/play bar,
 * bottom timeline with row headers, and the layer property panel.
 */
@Composable
fun EditorScreen(
    scene: Scene?,
    onBack: () -> Unit,
    onExport: (Scene) -> Unit,
    onSceneChanged: (Scene) -> Unit = {},
    onReverse: (String, ReverseSettings) -> Unit = { _, _ -> },
    onImportProject: (Uri) -> Unit = {},
    onExportProject: (Scene, Uri) -> Unit = { _, _ -> },
    reverseState: OperationProgress = OperationProgress(),
    exportState: OperationProgress = OperationProgress(),
    projects: List<ProjectMeta> = emptyList(),
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val showReverse = remember { mutableStateOf(false) }
    val reverseSettings = remember { mutableStateOf(ReverseSettings()) }
    val selectedIndex = remember { mutableStateOf(0) }
    val playheadMs = remember { mutableStateOf(0L) }
    val selectedEasing = remember { mutableStateOf(Easing.LINEAR) }
    val hint = remember { mutableStateOf("") }
    val elements = remember { mutableStateListOf<SceneElement>() }
    val pendingUris = remember { mutableStateListOf<Uri>() }
    val pickedMedia = remember { mutableStateListOf<PickedMedia>() }
    val showPickerDialog = remember { mutableStateOf(false) }
    val showTextDialog = remember { mutableStateOf(false) }
    val showDrawingDialog = remember { mutableStateOf(false) }
    val showEffectBrowser = remember { mutableStateOf(false) }
    val showCamera = remember { mutableStateOf(false) }
    val showPath = remember { mutableStateOf(false) }
    val showNested = remember { mutableStateOf(false) }
    val editingText = remember { mutableStateOf<StyledText?>(null) }
    val showAddMenu = remember { mutableStateOf(false) }
    val showProperties = remember { mutableStateOf(true) }
    val showSettings = remember { mutableStateOf(false) }
    val showGrid = remember { mutableStateOf(false) }
    val showZoomGuide = remember { mutableStateOf(false) }
    val playing = remember { mutableStateOf(false) }
    val undoStack = remember { mutableStateListOf<List<SceneElement>>() }
    val redoStack = remember { mutableStateListOf<List<SceneElement>>() }

    val pickAudio = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if (uri != null) {
            undoStack.add(elements.toList())
            elements.add(
                SceneElement(
                    id = System.currentTimeMillis(),
                    label = "Audio ${elements.size + 1}",
                    type = ElementType.AUDIO,
                    startMs = 0L,
                    endMs = currentDuration(elements, scene),
                    sourceUri = uri.toString()
                )
            )
            selectedIndex.value = elements.lastIndex
            scene?.let { onSceneChanged(it.copy(elements = elements.toList())) }
        }
    }
    val saveProjectLauncher = rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("application/json")) { uri ->
        if (uri != null) scene?.let { onExportProject(it, uri) }
    }
    val openProjectLauncher = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        if (uri != null) onImportProject(uri)
    }

    val pickMedia = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.PickMultipleVisualMedia()
    ) { uris ->
        pendingUris.clear()
        pendingUris.addAll(uris)
    }

    LaunchedEffect(scene?.id) {
        elements.clear()
        if (scene != null) elements.addAll(scene.elements)
        selectedIndex.value = 0
        playheadMs.value = 0L
        undoStack.clear()
        redoStack.clear()
    }

    val uriSnapshot = pendingUris.toList()
    LaunchedEffect(uriSnapshot) {
        if (uriSnapshot.isEmpty()) return@LaunchedEffect
        val items = withContext(Dispatchers.IO) {
            uriSnapshot.map { MediaLoader.describe(context, it) }
        }
        pendingUris.clear()
        pickedMedia.clear()
        pickedMedia.addAll(items)
        showPickerDialog.value = true
    }

    val current = scene
    if (current == null) {
        Box(modifier.fillMaxSize().background(editorBg), contentAlignment = Alignment.Center) {
            Text("Loading project...", color = Color.White)
        }
        return
    }

    fun commit(transform: (SceneElement) -> SceneElement) {
        val index = selectedIndex.value
        val element = elements.getOrNull(index) ?: return
        undoStack.add(elements.toList())
        elements[index] = transform(element)
        onSceneChanged(current.copy(elements = elements.toList()))
    }

    fun addElement(element: SceneElement) {
        undoStack.add(elements.toList())
        elements.add(element)
        selectedIndex.value = elements.lastIndex
        onSceneChanged(current.copy(elements = elements.toList()))
        showAddMenu.value = false
    }

    val selected = elements.getOrNull(selectedIndex.value)
    val transformValues = KeyframeEvaluator.transformAt(
        selected?.transform ?: com.ankitmotion.core.model.KeyableTransform(),
        playheadMs.value
    )

    LaunchedEffect(playing.value, current.durationMs) {
        if (!playing.value) return@LaunchedEffect
        while (playing.value) {
            delay(33)
            playheadMs.value = (playheadMs.value + 33L) % current.durationMs.coerceAtLeast(1L)
        }
    }

    Column(modifier.fillMaxSize().background(editorBg)) {
        // Project bar: exit, editable title, settings, share, overflow.
        Row(
            modifier = Modifier.fillMaxWidth().height(42.dp).background(chromeBg),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBack) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Back", tint = Color.White)
            }
            BasicTextField(
                value = current.title,
                onValueChange = { onSceneChanged(current.copy(title = it)) },
                singleLine = true,
                textStyle = TextStyle(color = Color.White, fontSize = 15.sp),
                modifier = Modifier.weight(1f).padding(horizontal = 8.dp)
            )
            IconButton(onClick = { showSettings.value = true }) {
                Icon(Icons.Filled.Settings, contentDescription = "Project settings", tint = Color.White)
            }
            IconButton(onClick = {
                saveProjectLauncher.launch("${current.title.replace(Regex("[^A-Za-z0-9_-]"), "_")}.rve")
            }) {
                Icon(Icons.Filled.Share, contentDescription = "Share project", tint = Color.White)
            }
            IconButton(onClick = { showAddMenu.value = !showAddMenu.value }) {
                Icon(Icons.Filled.MoreVert, contentDescription = "More", tint = Color.White)
            }
        }

        // Canvas and the vertical preview tool rail.
        Box(modifier = Modifier.weight(1f).fillMaxWidth()) {
            Box(
                modifier = Modifier.fillMaxSize().background(Color(0xFF0B0B0E)),
                contentAlignment = Alignment.Center
            ) {
                val ratio = current.width.toFloat() / current.height.toFloat().coerceAtLeast(1f)
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.78f)
                        .aspectRatio(ratio.coerceIn(0.4f, 2.6f))
                        .clip(MaterialTheme.shapes.small)
                        .background(Color.Black)
                        .graphicsLayer(
                            scaleX = transformValues.scaleX.coerceIn(0.1f, 4f),
                            scaleY = transformValues.scaleY.coerceIn(0.1f, 4f)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    when (selected?.type) {
                        ElementType.TEXT -> Text(
                            text = selected.text?.text ?: "",
                            color = runCatching {
                                Color(android.graphics.Color.parseColor(selected.text?.color ?: "#FFFFFF"))
                            }.getOrDefault(Color.White),
                            fontSize = selected.text?.fontSize?.let { it.sp }
                                ?: androidx.compose.ui.unit.TextUnit.Unspecified,
                            fontWeight = if (selected.text?.bold == true) FontWeight.Bold else FontWeight.Normal,
                            modifier = Modifier.padding(16.dp)
                        )
                        ElementType.DRAWING -> selected.drawing?.let { DrawingPreview(it) }
                            ?: Text("Drawing", color = Color.White)
                        else -> MediaThumbnail(
                            uri = selected?.sourceUri,
                            isVideo = selected?.type == ElementType.VIDEO,
                            modifier = Modifier.fillMaxSize(),
                            colorFilter = com.ankitmotion.feature.editor.media.EffectPreviewFilter
                                .forEffects(selected?.effects.orEmpty())
                        )
                    }
                    if (showGrid.value) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .border(1.dp, Color.White.copy(alpha = 0.35f))
                        )
                    }
                    Text(
                        text = "${current.width}x${current.height} · ${current.fps}fps",
                        color = Color.White.copy(alpha = 0.8f),
                        style = MaterialTheme.typography.labelSmall,
                        modifier = Modifier.align(Alignment.TopStart).padding(6.dp)
                    )
                }
            }

            Column(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .width(50.dp)
                    .fillMaxHeight()
                    .background(Color(0xFF17171C)),
                verticalArrangement = Arrangement.Top
            ) {
                RailButton(Icons.Filled.Image, "Preview mode") { showGrid.value = !showGrid.value }
                RailButton(Icons.Filled.Dashboard, "Grid") { showGrid.value = !showGrid.value }
                RailButton(Icons.Filled.Layers, "Layers") { showProperties.value = !showProperties.value }
                RailButton(Icons.Filled.CameraAlt, "Camera") { showCamera.value = true }
                RailButton(Icons.Filled.ZoomIn, "Zoom") { showZoomGuide.value = !showZoomGuide.value }
            }

            if (showZoomGuide.value) {
                Text(
                    "Swipe to adjust",
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(12.dp)
                        .background(Color.Black.copy(alpha = 0.7f))
                        .padding(8.dp)
                )
            }

            if (showAddMenu.value) {
                AddLayerMenu(onPick = { index ->
                    showAddMenu.value = false
                    when (index) {
                        0 -> pickMedia.launch(
                            PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageAndVideo)
                        )
                        1 -> {
                            editingText.value = StyledText()
                            showTextDialog.value = true
                        }
                        2 -> addElement(
                            SceneElement(
                                id = System.currentTimeMillis(),
                                label = "Shape ${elements.size + 1}",
                                type = ElementType.SHAPE,
                                startMs = 0L,
                                endMs = 2_000L.coerceAtMost(current.durationMs)
                            )
                        )
                        3 -> showCamera.value = true
                        4 -> pickAudio.launch("audio/*")
                        5 -> showDrawingDialog.value = true
                        6 -> {
                            if (selected == null) {
                                addElement(
                                    SceneElement(
                                        id = System.currentTimeMillis(),
                                        label = "Shape ${elements.size + 1}",
                                        type = ElementType.SHAPE,
                                        startMs = 0L,
                                        endMs = current.durationMs
                                    )
                                )
                            }
                            showPath.value = true
                        }
                        7 -> addElement(
                            SceneElement(
                                id = System.currentTimeMillis(),
                                label = "Empty group",
                                type = ElementType.NULL_OBJECT,
                                startMs = 0L,
                                endMs = current.durationMs
                            )
                        )
                        8, 9 -> showNested.value = true
                        10 -> openProjectLauncher.launch(arrayOf("application/zip", "*/*"))
                    }
                }, onDismiss = { showAddMenu.value = false })
            }
        }

        // Info bar: selected layer and playhead readout.
        Row(
            modifier = Modifier.fillMaxWidth().height(46.dp).background(timelineBg).padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                selected?.label ?: "No layer selected",
                color = Color.White,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 1
            )
            Text(
                "${playheadMs.value} ms / ${current.durationMs} ms",
                color = Color.White.copy(alpha = 0.7f),
                style = MaterialTheme.typography.bodySmall
            )
        }

        // Play bar: undo/redo, frame stepping, play, duplicate, reverse, panel toggle.
        Row(
            modifier = Modifier.fillMaxWidth().height(46.dp).background(chromeBg),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            PlayBarButton(Icons.Filled.Undo, "Undo", enabled = undoStack.isNotEmpty()) {
                val previous = undoStack.removeAt(undoStack.lastIndex)
                redoStack.add(elements.toList())
                elements.clear(); elements.addAll(previous)
                onSceneChanged(current.copy(elements = elements.toList()))
            }
            PlayBarButton(Icons.Filled.Redo, "Redo", enabled = redoStack.isNotEmpty()) {
                val next = redoStack.removeAt(redoStack.lastIndex)
                undoStack.add(elements.toList())
                elements.clear(); elements.addAll(next)
                onSceneChanged(current.copy(elements = elements.toList()))
            }
            PlayBarButton(Icons.Filled.SkipPrevious, "Previous frame") {
                playheadMs.value = (playheadMs.value - 33L).coerceAtLeast(0L)
            }
            PlayBarButton(if (playing.value) Icons.Filled.Pause else Icons.Filled.PlayArrow, "Play") {
                playing.value = !playing.value
            }
            PlayBarButton(Icons.Filled.SkipNext, "Next frame") {
                playheadMs.value = (playheadMs.value + 33L).coerceAtMost(current.durationMs)
            }
            PlayBarButton(Icons.Filled.ContentCopy, "Duplicate layer", enabled = selected != null) {
                selected?.let { addElement(it.copy(id = System.currentTimeMillis(), label = "${it.label} copy")) }
            }
            PlayBarButton(Icons.Filled.Save, "Reverse video", enabled = selected?.sourceUri != null) {
                showReverse.value = true
                showSettings.value = true
            }
            PlayBarButton(Icons.Filled.Menu, "Toggle properties") {
                showProperties.value = !showProperties.value
            }
        }

        // Timeline: ruler, layer rows with 120dp headers, and add/overflow controls.
        Column(modifier = Modifier.fillMaxWidth().height(180.dp).background(timelineBg)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(24.dp)
                    .horizontalScroll(rememberScrollState())
                    .clickable { }
            ) {
                (0..current.durationMs step 500L).forEach { ms ->
                    Box(
                        modifier = Modifier
                            .width(72.dp)
                            .fillMaxHeight()
                            .border(0.5.dp, Color.White.copy(alpha = 0.12f))
                            .clickable { playheadMs.value = ms },
                        contentAlignment = Alignment.Center
                    ) {
                        Text("${ms / 1000}s", color = Color.White.copy(alpha = 0.6f), fontSize = 9.sp)
                    }
                }
            }
            LazyColumn(modifier = Modifier.weight(1f)) {
                itemsIndexed(elements) { index, element ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(28.dp)
                            .background(
                                if (selectedIndex.value == index) Color.White.copy(alpha = 0.1f)
                                else Color.Transparent
                            )
                            .clickable { selectedIndex.value = index }
                    ) {
                        Row(
                            modifier = Modifier.width(120.dp).fillMaxHeight().padding(horizontal = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Filled.Layers,
                                contentDescription = null,
                                tint = accent,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(Modifier.width(4.dp))
                            Text(
                                element.label,
                                color = Color.White,
                                fontSize = 10.sp,
                                maxLines = 1,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(vertical = 2.dp)
                                .background(Color.Transparent),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(
                                        (element.endMs.toFloat() / current.durationMs.coerceAtLeast(1L))
                                            .coerceIn(0.05f, 1f)
                                    )
                                    .fillMaxHeight()
                                    .background(accent.copy(alpha = 0.45f))
                                    .padding(start = 6.dp),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                Text(element.label, color = Color.White, fontSize = 9.sp, maxLines = 1)
                            }
                        }
                    }
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth().height(36.dp).background(Color(0xFF202026)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { showAddMenu.value = !showAddMenu.value }) {
                    Icon(Icons.Filled.Add, contentDescription = "Add layer", tint = accent)
                }
                TextButton(onClick = { selectedIndex.value = -1 }) {
                    Text("Clear", color = Color.White, fontSize = 11.sp)
                }
                Spacer(Modifier.weight(1f))
                Text("${elements.size} layers", color = Color.White.copy(alpha = 0.7f), fontSize = 11.sp)
                Spacer(Modifier.width(8.dp))
            }
        }

        if (showProperties.value) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .background(Color(0xFFFFFFFF))
                    .verticalScroll(rememberScrollState())
                    .padding(12.dp)
            ) {
                if (selected == null) {
                    Text("Select a layer to edit its properties", color = Color(0xFF666666))
                } else {
                    Text("${selected.label} · ${selected.type}", fontWeight = FontWeight.Bold, color = Color.Black)
                    Text("Source: ${selected.sourceUri ?: "generated"}", color = Color(0xFF666666), fontSize = 11.sp)

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Hidden", color = Color.Black, modifier = Modifier.weight(1f))
                        Switch(
                            checked = selected.hidden,
                            onCheckedChange = { hidden -> commit { it.copy(hidden = hidden) } }
                        )
                    }
                    Text("Blend", style = MaterialTheme.typography.labelSmall, color = Color.Black)
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        listOf(BlendingMode.NORMAL, BlendingMode.MULTIPLY, BlendingMode.SCREEN, BlendingMode.OVERLAY)
                            .forEach { mode ->
                                FilterChip(
                                    selected = selected.blendingMode == mode,
                                    onClick = { commit { it.copy(blendingMode = mode) } },
                                    label = { Text(mode.name.take(4)) }
                                )
                            }
                    }
                    if (selected.type == ElementType.SHAPE) {
                        Text("Shape", style = MaterialTheme.typography.labelSmall, color = Color.Black)
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ShapeKind.entries.forEach { kind ->
                                FilterChip(
                                    selected = selected.shapeKind == kind,
                                    onClick = { commit { it.copy(shapeKind = kind) } },
                                    label = { Text(kind.name.take(3)) }
                                )
                            }
                        }
                        TextButton(onClick = {
                            commit { it.copy(fillColor = if (it.fillColor == "#22D3EE") "#FF8A3D" else "#22D3EE") }
                        }) { Text("Fill: ${selected.fillColor}") }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        TextButton(onClick = {
                            commit {
                                it.copy(stroke = if (it.stroke == null) com.ankitmotion.core.model.StrokeStyle() else null)
                            }
                        }) { Text("Stroke") }
                        TextButton(onClick = {
                            commit {
                                it.copy(shadow = if (it.shadow == null) com.ankitmotion.core.model.DropShadow(enabled = true) else null)
                            }
                        }) { Text("Shadow") }
                        TextButton(onClick = {
                            commit {
                                val point = SpeedPoint(playheadMs.value, 1f)
                                it.copy(speedMap = it.speedMap + point)
                            }
                        }) { Text("+ Speed key") }
                        TextButton(onClick = { showEffectBrowser.value = true }) { Text("Effects") }
                        TextButton(onClick = { showPath.value = true }) { Text("Motion path") }
                    }
                    Text("Speed keys: ${selected.speedMap.size}", color = Color(0xFF666666), fontSize = 11.sp)
                    if (selected.type == ElementType.TEXT) {
                        TextButton(onClick = {
                            editingText.value = selected.text ?: StyledText()
                            showTextDialog.value = true
                        }) { Text("Edit text") }
                    }

                    Text("Playhead ${playheadMs.value} ms", fontWeight = FontWeight.Bold, color = Color.Black)
                    Slider(
                        value = playheadMs.value.toFloat(),
                        valueRange = 0f..current.durationMs.coerceAtLeast(1L).toFloat(),
                        onValueChange = { playheadMs.value = it.toLong() }
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        listOf(Easing.LINEAR, Easing.EASE_IN_OUT, Easing.BOUNCE, Easing.ELASTIC)
                            .forEach { easing ->
                                FilterChip(
                                    selected = selectedEasing.value == easing,
                                    onClick = { selectedEasing.value = easing },
                                    label = { Text(easing.name) }
                                )
                            }
                    }
                    AnimatedRow("X", selected.transform.x, -500f..500f, playheadMs.value,
                        onValue = { v -> commit { it.copy(transform = it.transform.copy(x = KeyableFloat(v, it.transform.x.keyframes))) } },
                        onKey = {
                            val v = KeyframeEvaluator.evaluate(selected.transform.x, playheadMs.value)
                            commit {
                                val kf = Keyframe(playheadMs.value, v, selectedEasing.value)
                                it.copy(transform = it.transform.copy(
                                    x = it.transform.x.copy(keyframes = it.transform.x.keyframes + kf)
                                ))
                            }
                        }
                    )
                    AnimatedRow("Y", selected.transform.y, -500f..500f, playheadMs.value,
                        onValue = { v -> commit { it.copy(transform = it.transform.copy(y = KeyableFloat(v, it.transform.y.keyframes))) } },
                        onKey = {
                            val v = KeyframeEvaluator.evaluate(selected.transform.y, playheadMs.value)
                            commit {
                                val kf = Keyframe(playheadMs.value, v, selectedEasing.value)
                                it.copy(transform = it.transform.copy(
                                    y = it.transform.y.copy(keyframes = it.transform.y.keyframes + kf)
                                ))
                            }
                        }
                    )
                    AnimatedRow("Scale", selected.transform.scaleX, 0.1f..3f, playheadMs.value,
                        onValue = { v -> commit { it.copy(transform = it.transform.copy(
                            scaleX = KeyableFloat(v, it.transform.scaleX.keyframes),
                            scaleY = KeyableFloat(v, it.transform.scaleY.keyframes)
                        )) } },
                        onKey = {
                            val v = KeyframeEvaluator.evaluate(selected.transform.scaleX, playheadMs.value)
                            commit {
                                val kf = Keyframe(playheadMs.value, v, selectedEasing.value)
                                it.copy(transform = it.transform.copy(
                                    scaleX = it.transform.scaleX.copy(keyframes = it.transform.scaleX.keyframes + kf),
                                    scaleY = it.transform.scaleY.copy(keyframes = it.transform.scaleY.keyframes + kf)
                                ))
                            }
                        }
                    )
                    AnimatedRow("Rotate", selected.transform.rotation, -180f..180f, playheadMs.value,
                        onValue = { v -> commit { it.copy(transform = it.transform.copy(rotation = KeyableFloat(v, it.transform.rotation.keyframes))) } },
                        onKey = {
                            val v = KeyframeEvaluator.evaluate(selected.transform.rotation, playheadMs.value)
                            commit {
                                val kf = Keyframe(playheadMs.value, v, selectedEasing.value)
                                it.copy(transform = it.transform.copy(
                                    rotation = it.transform.rotation.copy(keyframes = it.transform.rotation.keyframes + kf)
                                ))
                            }
                        }
                    )
                    AnimatedRow("Opacity", selected.opacity, 0f..1f, playheadMs.value,
                        onValue = { v -> commit { it.copy(opacity = KeyableFloat(v, it.opacity.keyframes)) } },
                        onKey = {
                            val v = KeyframeEvaluator.evaluate(selected.opacity, playheadMs.value)
                            commit {
                                val kf = Keyframe(playheadMs.value, v, selectedEasing.value)
                                it.copy(opacity = it.opacity.copy(keyframes = it.opacity.keyframes + kf))
                            }
                        }
                    )
                    TextButton(onClick = { commit { it.copy(transform = com.ankitmotion.core.model.KeyableTransform()) } }) {
                        Text("Clear transform keys")
                    }

                    Text("Effects (${EffectRegistry.all().size})", style = MaterialTheme.typography.labelLarge, color = Color.Black)
                    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        EffectRegistry.all().take(6).forEach { def ->
                            TextButton(onClick = {
                                val instance = EffectRegistry.createInstance(def.id, System.currentTimeMillis())
                                    ?: return@TextButton
                                commit { it.copy(effects = it.effects + instance) }
                            }) { Text(def.name) }
                        }
                    }
                    selected.effects.forEach { instance ->
                        val def = EffectRegistry.get(instance.definitionId)
                        Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
                            Column(Modifier.padding(8.dp)) {
                                Text(def?.name ?: instance.definitionId)
                                def?.parameters?.filter { it.type == ParameterType.FLOAT }?.forEach { param ->
                                    val fallback = param.defaultValue.toFloatOrNull() ?: 0f
                                    val value = instance.properties[param.id]?.toFloatOrNull() ?: fallback
                                    Slider(
                                        value = value,
                                        valueRange = 0f..3f,
                                        onValueChange = { changed ->
                                            commit {
                                                it.copy(effects = it.effects.map { fx ->
                                                    if (fx.instanceId == instance.instanceId) {
                                                        fx.copy(properties = fx.properties + (param.id to changed.toString()))
                                                    } else fx
                                                })
                                            }
                                        }
                                    )
                                }
                            }
                        }
                    }
                }

                if (showReverse.value) {
                    ReversePanel(
                        settings = reverseSettings.value,
                        onChange = { reverseSettings.value = it },
                        onApply = {
                            val uri = selected?.sourceUri
                            if (uri.isNullOrBlank()) {
                                hint.value = "Select a video layer first"
                            } else {
                                hint.value = ""
                                onReverse(uri, reverseSettings.value)
                            }
                        }
                    )
                }
                JobStatus("Reverse", reverseState)
                JobStatus("Export", exportState)
                if (hint.value.isNotBlank()) Text(hint.value, color = Color(0xFFB00020))
            }
        }
    }

    if (showSettings.value) {
        AlertDialog(
            onDismissRequest = { showSettings.value = false },
            title = { Text("Project settings") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text("${current.width} x ${current.height} · ${current.fps} fps")
                    Text("Reverse video is local only — no uploads.")
                    TextButton(onClick = {
                        openProjectLauncher.launch(arrayOf("*/*"))
                        showSettings.value = false
                    }) { Text("Import project") }
                    TextButton(onClick = {
                        saveProjectLauncher.launch("${current.title.replace(Regex("[^A-Za-z0-9_-]"), "_")}.rve")
                        showSettings.value = false
                    }) { Text("Save project") }
                    Button(onClick = {
                        onExport(current)
                        showSettings.value = false
                    }) { Text("Export video") }
                }
            },
            confirmButton = { TextButton(onClick = { showSettings.value = false }) { Text("Close") } }
        )
    }

    if (showCamera.value) {
        CameraCaptureDialog(
            onDismiss = { showCamera.value = false },
            onCaptured = { uri ->
                addElement(
                    SceneElement(
                        id = System.currentTimeMillis(),
                        label = "Camera photo",
                        type = ElementType.IMAGE,
                        startMs = 0L,
                        endMs = current.durationMs,
                        sourceUri = uri.toString()
                    )
                )
                showCamera.value = false
            }
        )
    }

    if (showPath.value) {
        PathEditorDialog(
            initialX = selected?.transform?.x ?: com.ankitmotion.core.model.KeyableFloat(0f),
            initialY = selected?.transform?.y ?: com.ankitmotion.core.model.KeyableFloat(0f),
            durationMs = current.durationMs,
            onDismiss = { showPath.value = false },
            onSave = { x, y ->
                commit { it.copy(transform = it.transform.copy(x = x, y = y)) }
                showPath.value = false
            }
        )
    }

    if (showNested.value) {
        AlertDialog(
            onDismissRequest = { showNested.value = false },
            title = { Text("Add scene / element") },
            text = {
                LazyColumn {
                    items(projects, key = { it.id }) { project ->
                        TextButton(onClick = {
                            addElement(
                                SceneElement(
                                    id = System.currentTimeMillis(),
                                    label = "Scene: ${project.title}",
                                    type = ElementType.NESTED_SCENE,
                                    startMs = 0L,
                                    endMs = current.durationMs,
                                    nestedSceneId = project.id
                                )
                            )
                            showNested.value = false
                        }) { Text(project.title) }
                    }
                    if (projects.isEmpty()) item { Text("No projects yet — create one on the home screen first.") }
                }
            },
            confirmButton = { TextButton(onClick = { showNested.value = false }) { Text("Close") } }
        )
    }

    if (showTextDialog.value) {
        TextEditorDialog(
            initial = editingText.value ?: StyledText(),
            onDismiss = { showTextDialog.value = false },
            onSave = { styled ->
                if (selected?.type == ElementType.TEXT) {
                    commit { it.copy(text = styled, label = styled.text.take(16)) }
                } else {
                    addElement(
                        SceneElement(
                            id = System.currentTimeMillis(),
                            label = styled.text.take(16),
                            type = ElementType.TEXT,
                            startMs = 0L,
                            endMs = current.durationMs,
                            text = styled
                        )
                    )
                }
                showTextDialog.value = false
            }
        )
    }

    if (showDrawingDialog.value) {
        DrawingCanvasDialog(
            onDismiss = { showDrawingDialog.value = false },
            onSave = { drawing: DrawingPath ->
                addElement(
                    SceneElement(
                        id = System.currentTimeMillis(),
                        label = "Drawing ${elements.size + 1}",
                        type = ElementType.DRAWING,
                        startMs = 0L,
                        endMs = current.durationMs,
                        drawing = drawing
                    )
                )
                showDrawingDialog.value = false
            }
        )
    }

    if (showEffectBrowser.value) {
        EffectBrowserDialog(
            onDismiss = { showEffectBrowser.value = false },
            onPick = { id ->
                val instance = EffectRegistry.createInstance(id, System.currentTimeMillis())
                if (instance != null) commit { it.copy(effects = it.effects + instance) }
                showEffectBrowser.value = false
            }
        )
    }

    if (showPickerDialog.value) {
        MediaPickerDialog(
            items = pickedMedia,
            onDismiss = { showPickerDialog.value = false },
            onConfirm = { chosen ->
                undoStack.add(elements.toList())
                val baseId = System.currentTimeMillis()
                chosen.forEachIndexed { offset, media ->
                    val length = if (media.isVideo && media.durationMs != null) {
                        media.durationMs!!.coerceIn(500L, current.durationMs.coerceAtLeast(500L))
                    } else {
                        2_500L.coerceAtMost(current.durationMs)
                    }
                    elements.add(
                        SceneElement(
                            id = baseId + offset.toLong(),
                            label = media.name,
                            type = if (media.isVideo) ElementType.VIDEO else ElementType.IMAGE,
                            startMs = 0L,
                            endMs = length,
                            sourceUri = media.uri.toString()
                        )
                    )
                }
                if (chosen.isNotEmpty()) selectedIndex.value = elements.lastIndex
                showPickerDialog.value = false
                onSceneChanged(current.copy(elements = elements.toList()))
            }
        )
    }
}

@Composable
private fun RailButton(icon: ImageVector, label: String, onClick: () -> Unit) {
    IconButton(
        onClick = onClick,
        modifier = Modifier.size(48.dp)
    ) {
        Icon(icon, contentDescription = label, tint = Color.White)
    }
}

@Composable
private fun PlayBarButton(
    icon: ImageVector,
    label: String,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    IconButton(onClick = onClick, enabled = enabled, modifier = Modifier.size(44.dp)) {
        Icon(icon, contentDescription = label, tint = if (enabled) Color.White else Color.Gray)
    }
}

@Composable
private fun AddLayerMenu(onPick: (Int) -> Unit, onDismiss: () -> Unit) {
    val items = listOf(
        "Media" to Icons.Filled.Image,
        "Text" to Icons.Filled.TextFields,
        "Shape" to Icons.Filled.CropSquare,
        "Camera" to Icons.Filled.CameraAlt,
        "Audio" to Icons.Filled.Audiotrack,
        "Freehand Drawing" to Icons.Filled.Brush,
        "Vector Drawing" to Icons.Filled.Dashboard,
        "Empty Group" to Icons.Filled.GroupWork,
        "Element / Project" to Icons.Filled.Widgets,
        "Object / Element" to Icons.Filled.Layers,
        "Template" to Icons.Filled.Save
    )
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.35f))
                .clickable { onDismiss() }
        )
        Card(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(12.dp)
                .width(340.dp)
        ) {
            Column(modifier = Modifier.padding(8.dp).verticalScroll(rememberScrollState())) {
                items.forEachIndexed { index, item ->
                    TextButton(
                        onClick = { onPick(index) },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(item.second, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(10.dp))
                        Text(item.first, modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

@Composable
private fun AnimatedRow(
    label: String,
    animated: KeyableFloat,
    range: ClosedFloatingPointRange<Float>,
    playheadMs: Long,
    onValue: (Float) -> Unit,
    onKey: () -> Unit
) {
    val value = KeyframeEvaluator.evaluate(animated, playheadMs)
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text("${label} ${"%.2f".format(value)} · ${animated.keyframes.size} keys", modifier = Modifier.weight(1f))
        Slider(
            value = value.coerceIn(range),
            valueRange = range,
            onValueChange = onValue,
            modifier = Modifier.weight(2f)
        )
        TextButton(onClick = onKey) { Text("+Key") }
    }
}

@Composable
private fun JobStatus(label: String, state: OperationProgress) {
    val message = state.message ?: return
    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text("$label: $message", style = MaterialTheme.typography.bodySmall)
        LinearProgressIndicator(
            progress = state.progress.coerceIn(0f, 1f),
            modifier = Modifier.fillMaxWidth().padding(top = 2.dp)
        )
    }
}
