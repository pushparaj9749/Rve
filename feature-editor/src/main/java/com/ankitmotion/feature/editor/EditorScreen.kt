package com.ankitmotion.feature.editor

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.ankitmotion.core.effect.EffectRegistry
import com.ankitmotion.core.model.BlendingMode
import com.ankitmotion.core.model.DrawingPath
import com.ankitmotion.core.model.Easing
import com.ankitmotion.core.model.ElementType
import com.ankitmotion.core.model.KeyableFloat
import com.ankitmotion.core.model.Keyframe
import com.ankitmotion.core.model.KeyframeEvaluator
import com.ankitmotion.core.model.OperationProgress
import com.ankitmotion.core.model.ProjectMeta
import com.ankitmotion.core.model.ParameterType
import com.ankitmotion.core.model.ShapeKind
import com.ankitmotion.core.model.SpeedPoint
import com.ankitmotion.core.model.StyledText
import com.ankitmotion.core.model.ReverseSettings
import com.ankitmotion.core.model.Scene
import com.ankitmotion.core.model.SceneElement
import com.ankitmotion.feature.editor.media.MediaLoader
import com.ankitmotion.feature.editor.media.MediaThumbnail
import com.ankitmotion.feature.editor.media.PickedMedia
import com.ankitmotion.feature.reverse.ReversePanel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

private fun currentDuration(elements: List<SceneElement>, scene: Scene?): Long =
    scene?.durationMs?.coerceAtLeast(500L) ?: 2_000L

@OptIn(ExperimentalMaterial3Api::class)
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

    val pickAudio = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if (uri != null) {
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

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(scene?.title ?: "Editor") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    TextButton(onClick = { showReverse.value = !showReverse.value }) {
                        Text("Reverse")
                    }
                    Button(onClick = { scene?.let(onExport) }) { Text("Export") }
                }
            )
        }
    ) { padding ->
        val current = scene
        if (current == null) {
            Box(Modifier.padding(padding).fillMaxSize(), contentAlignment = Alignment.Center) {
                Text("Loading project...")
            }
            return@Scaffold
        }

        fun commit(transform: (SceneElement) -> SceneElement) {
            val index = selectedIndex.value
            val element = elements.getOrNull(index) ?: return
            elements[index] = transform(element)
            onSceneChanged(current.copy(elements = elements.toList()))
        }

        val selected = elements.getOrNull(selectedIndex.value)
        val transformValues = KeyframeEvaluator.transformAt(
            selected?.transform ?: com.ankitmotion.core.model.KeyableTransform(),
            playheadMs.value
        )

        Column(Modifier.padding(padding).fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(12.dp)
                    .clip(MaterialTheme.shapes.medium)
                    .background(MaterialTheme.colorScheme.surfaceVariant)
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
                            androidx.compose.ui.graphics.Color(
                                android.graphics.Color.parseColor(selected.text?.color ?: "#FFFFFF")
                            )
                        }.getOrDefault(androidx.compose.ui.graphics.Color.White),
                        fontSize = selected.text?.fontSize?.let { it.sp }
                            ?: androidx.compose.ui.unit.TextUnit.Unspecified,
                        fontWeight = if (selected.text?.bold == true) androidx.compose.ui.text.font.FontWeight.Bold
                        else androidx.compose.ui.text.font.FontWeight.Normal,
                        modifier = Modifier.padding(16.dp)
                    )
                    ElementType.DRAWING -> selected.drawing?.let { DrawingPreview(it) }
                        ?: Text("Drawing")
                    else -> MediaThumbnail(
                        uri = selected?.sourceUri,
                        isVideo = selected?.type == ElementType.VIDEO,
                        modifier = Modifier.fillMaxSize(),
                        colorFilter = com.ankitmotion.feature.editor.media.EffectPreviewFilter
                            .forEffects(selected?.effects.orEmpty())
                    )
                }
                Text(
                    text = "PREVIEW · ${current.width}x${current.height} · ${current.fps}fps",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(8.dp)
                        .background(
                            MaterialTheme.colorScheme.surface.copy(alpha = 0.75f),
                            MaterialTheme.shapes.small
                        )
                        .padding(6.dp)
                )
            }

            Row(modifier = Modifier.weight(1f)) {
                Column(
                    modifier = Modifier
                        .width(140.dp)
                        .padding(8.dp)
                        .border(
                            1.dp,
                            MaterialTheme.colorScheme.outline.copy(alpha = 0.2f),
                            MaterialTheme.shapes.small
                        )
                ) {
                    Text("Layers", fontWeight = FontWeight.Bold, modifier = Modifier.padding(8.dp))
                    TextButton(onClick = {
                        pickMedia.launch(
                            PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageAndVideo)
                        )
                    }) { Text("+ Media") }
                    Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                        TextButton(onClick = {
                            editingText.value = StyledText()
                            showTextDialog.value = true
                        }) { Text("+ Text") }
                        TextButton(onClick = { showDrawingDialog.value = true }) { Text("Draw") }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                        TextButton(onClick = { pickAudio.launch("audio/*") }) { Text("Audio") }
                        TextButton(onClick = { showEffectBrowser.value = true }) { Text("FX") }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                        TextButton(onClick = { openProjectLauncher.launch(arrayOf("*/*")) }) { Text("Import") }
                        TextButton(onClick = {
                            saveProjectLauncher.launch("${current.title.replace(Regex("[^A-Za-z0-9_-]"), "_")}.rve")
                        }) { Text("Save as") }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                        TextButton(onClick = { showCamera.value = true }) { Text("Camera") }
                        TextButton(onClick = { showPath.value = true }) { Text("Path") }
                        TextButton(onClick = { showNested.value = true }) { Text("Nested") }
                    }
                    LazyColumn {
                        itemsIndexed(elements) { index, element ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { selectedIndex.value = index }
                                    .background(
                                        if (selectedIndex.value == index)
                                            MaterialTheme.colorScheme.primary.copy(alpha = 0.18f)
                                        else Color.Transparent
                                    )
                                    .padding(horizontal = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    "${element.type.name.first()} · ${element.label}",
                                    modifier = Modifier.weight(1f),
                                    maxLines = 1
                                )
                                IconButton(onClick = {
                                    elements.removeAt(index)
                                    if (selectedIndex.value >= elements.size) {
                                        selectedIndex.value = (elements.size - 1).coerceAtLeast(0)
                                    }
                                    onSceneChanged(current.copy(elements = elements.toList()))
                                }) {
                                    Icon(
                                        Icons.Filled.Delete,
                                        contentDescription = "Delete layer",
                                        modifier = Modifier.height(18.dp)
                                    )
                                }
                            }
                        }
                        item {
                            TextButton(onClick = {
                                elements.add(
                                    SceneElement(
                                        id = System.currentTimeMillis(),
                                        label = "Shape ${elements.size + 1}",
                                        type = ElementType.SHAPE,
                                        startMs = 0L,
                                        endMs = 2_000L.coerceAtMost(current.durationMs)
                                    )
                                )
                                selectedIndex.value = elements.lastIndex
                                onSceneChanged(current.copy(elements = elements.toList()))
                            }) { Text("+ Add shape") }
                        }
                    }
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                ) {
                    Text("Inspector", fontWeight = FontWeight.Bold)
                    if (selected == null) {
                        Text("Select a layer")
                    } else {
                        Text("${selected.label} · ${selected.type}")
                        Text("Source: ${selected.sourceUri ?: "generated"}")

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Hidden", modifier = Modifier.weight(1f))
                            Switch(
                                checked = selected.hidden,
                                onCheckedChange = { hidden -> commit { it.copy(hidden = hidden) } }
                            )
                        }
                        Text("Blend", style = MaterialTheme.typography.labelSmall)
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
                            Text("Shape", style = MaterialTheme.typography.labelSmall)
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
                        }
                        Text("Speed keys: ${selected.speedMap.size}")
                        if (selected.type == ElementType.TEXT) {
                            TextButton(onClick = {
                                editingText.value = selected.text ?: StyledText()
                                showTextDialog.value = true
                            }) { Text("Edit text") }
                        }
                        TextButton(onClick = { showEffectBrowser.value = true }) { Text("Browse effects") }
                        TextButton(onClick = { showPath.value = true }) { Text("Edit motion path") }

                        Text("Playhead ${playheadMs.value} ms", style = MaterialTheme.typography.labelLarge)
                        Slider(
                            value = playheadMs.value.toFloat(),
                            valueRange = 0f..current.durationMs.coerceAtLeast(1L).toFloat(),
                            onValueChange = { playheadMs.value = it.toLong() }
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            listOf(Easing.LINEAR, Easing.EASE_IN_OUT, Easing.BOUNCE, Easing.ELASTIC).forEach { easing ->
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

                        Text(
                            "Effects (${EffectRegistry.all().size})",
                            style = MaterialTheme.typography.labelLarge
                        )
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
                                    hint.value = "Pehle video layer select karo"
                                } else {
                                    hint.value = ""
                                    onReverse(uri, reverseSettings.value)
                                }
                            }
                        )
                    }

                    JobStatus("Reverse", reverseState)
                    JobStatus("Export", exportState)
                    if (hint.value.isNotBlank()) Text(hint.value, color = MaterialTheme.colorScheme.error)
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(8.dp)
            ) {
                Text("Timeline · playhead ${playheadMs.value}ms", fontWeight = FontWeight.Bold)
                elements.forEach { element ->
                    Row(modifier = Modifier.fillMaxWidth().height(26.dp)) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(
                                    (element.endMs.toFloat() / current.durationMs.coerceAtLeast(1L))
                                        .coerceIn(0.05f, 1f)
                                )
                                .padding(2.dp)
                                .clip(MaterialTheme.shapes.small)
                                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.45f)),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            Text(element.label, modifier = Modifier.padding(start = 6.dp), maxLines = 1)
                        }
                    }
                }
            }
        }

        if (showCamera.value) {
            CameraCaptureDialog(
                onDismiss = { showCamera.value = false },
                onCaptured = { uri ->
                    elements.add(
                        SceneElement(
                            id = System.currentTimeMillis(),
                            label = "Camera photo",
                            type = ElementType.IMAGE,
                            startMs = 0L,
                            endMs = current.durationMs,
                            sourceUri = uri.toString()
                        )
                    )
                    selectedIndex.value = elements.lastIndex
                    onSceneChanged(current.copy(elements = elements.toList()))
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
                title = { Text("Nested scene") },
                text = {
                    LazyColumn {
                        items(projects, key = { it.id }) { project ->
                            TextButton(onClick = {
                                elements.add(
                                    SceneElement(
                                        id = System.currentTimeMillis(),
                                        label = "Scene: ${project.title}",
                                        type = ElementType.NESTED_SCENE,
                                        startMs = 0L,
                                        endMs = current.durationMs,
                                        nestedSceneId = project.id
                                    )
                                )
                                selectedIndex.value = elements.lastIndex
                                onSceneChanged(current.copy(elements = elements.toList()))
                                showNested.value = false
                            }) { Text(project.title) }
                        }
                        if (projects.isEmpty()) item { Text("Koi project nahi — pehle home par project banao.") }
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
                        elements.add(
                            SceneElement(
                                id = System.currentTimeMillis(),
                                label = styled.text.take(16),
                                type = ElementType.TEXT,
                                startMs = 0L,
                                endMs = current.durationMs,
                                text = styled
                            )
                        )
                        selectedIndex.value = elements.lastIndex
                        onSceneChanged(current.copy(elements = elements.toList()))
                    }
                    showTextDialog.value = false
                }
            )
        }

        if (showDrawingDialog.value) {
            DrawingCanvasDialog(
                onDismiss = { showDrawingDialog.value = false },
                onSave = { drawing: DrawingPath ->
                    elements.add(
                        SceneElement(
                            id = System.currentTimeMillis(),
                            label = "Drawing ${elements.size + 1}",
                            type = ElementType.DRAWING,
                            startMs = 0L,
                            endMs = current.durationMs,
                            drawing = drawing
                        )
                    )
                    selectedIndex.value = elements.lastIndex
                    onSceneChanged(current.copy(elements = elements.toList()))
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
        Text("$label ${"%.2f".format(value)} · ${animated.keyframes.size} keys", modifier = Modifier.weight(1f))
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
