package com.ankitmotion.feature.editor

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import com.ankitmotion.core.model.DrawingPath
import com.ankitmotion.core.model.Vector2

/** Freehand drawing layer — same core interaction as the reference drawing tool. */
@Composable
internal fun DrawingCanvasDialog(
    onDismiss: () -> Unit,
    onSave: (DrawingPath) -> Unit
) {
    val points = remember { mutableStateListOf<Vector2>() }
    val width = remember { mutableStateOf(6f) }
    val colorHex = remember { mutableStateOf("#22D3EE") }
    val strokeColor = runCatching { Color(android.graphics.Color.parseColor(colorHex.value)) }
        .getOrDefault(Color.Cyan)

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Drawing layer") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Brush ${width.value.toInt()}px  ·  color ${colorHex.value}")
                Slider(
                    value = width.value,
                    valueRange = 1f..30f,
                    onValueChange = { width.value = it }
                )
                Canvas(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(260.dp)
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .pointerInput(Unit) {
                            detectDragGestures { change, _ ->
                                points.add(Vector2(change.position.x, change.position.y))
                            }
                        }
                ) {
                    if (points.size > 1) {
                        val path = Path()
                        path.moveTo(points[0].x, points[0].y)
                        points.drop(1).forEach { path.lineTo(it.x, it.y) }
                        drawPath(path, strokeColor, style = Stroke(width = width.value))
                    }
                }
                TextButton(onClick = { points.clear() }) { Text("Clear") }
            }
        },
        confirmButton = {
            TextButton(onClick = {
                onSave(DrawingPath(color = colorHex.value, width = width.value, points = points.toList()))
            }) { Text("Save") }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } }
    )
}

/** Preview renderer used by the editor thumbnail for DRAWING layers. */
@Composable
internal fun DrawingPreview(path: DrawingPath, modifier: Modifier = Modifier) {
    val strokeColor = runCatching { Color(android.graphics.Color.parseColor(path.color)) }
        .getOrDefault(Color.Cyan)
    Canvas(modifier = modifier.fillMaxSize()) {
        if (path.points.size < 2) return@Canvas
        val drawPath = Path()
        drawPath.moveTo(path.points[0].x, path.points[0].y)
        path.points.drop(1).forEach { drawPath.lineTo(it.x, it.y) }
        drawPath(drawPath, strokeColor, style = Stroke(width = path.width))
    }
}
