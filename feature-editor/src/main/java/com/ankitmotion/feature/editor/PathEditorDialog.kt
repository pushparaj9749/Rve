package com.ankitmotion.feature.editor

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import com.ankitmotion.core.model.Easing
import com.ankitmotion.core.model.KeyableFloat
import com.ankitmotion.core.model.Keyframe
import com.ankitmotion.core.model.Vector2

/** Spline-style 2D path editor over existing X/Y keyframes. */
@Composable
internal fun PathEditorDialog(
    initialX: KeyableFloat,
    initialY: KeyableFloat,
    durationMs: Long,
    onDismiss: () -> Unit,
    onSave: (KeyableFloat, KeyableFloat) -> Unit
) {
    val points = remember {
        mutableStateListOf<Vector2>().apply {
            val xs = initialX.keyframes.sortedBy { it.timeMs }.map { it.value }
            val ys = initialY.keyframes.sortedBy { it.timeMs }.map { it.value }
            val count = minOf(xs.size, ys.size)
            if (count > 0) {
                for (i in 0 until count) add(Vector2(xs[i], ys[i]))
            } else {
                add(Vector2(initialX.value, initialY.value))
            }
        }
    }
    val accent = MaterialTheme.colorScheme.primary

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Motion path · ${points.size} points") },
        text = {
            Column {
                Text(
                    "Tap to add points. Points are spaced across the layer duration; " +
                        "X/Y keyframes with LINEAR easing are written back.",
                    style = MaterialTheme.typography.bodySmall
                )
                Canvas(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(260.dp)
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .pointerInput(Unit) {
                            detectTapGestures { offset ->
                                val x = (offset.x / size.width - 0.5f) * 1000f
                                val y = (offset.y / size.height - 0.5f) * 1000f
                                points.add(Vector2(x, y))
                            }
                        }
                ) {
                    val mapped = points.map { point ->
                        Offset(
                            x = size.width * (point.x / 1000f + 0.5f),
                            y = size.height * (point.y / 1000f + 0.5f)
                        )
                    }
                    if (mapped.size > 1) {
                        val path = Path()
                        path.moveTo(mapped[0].x, mapped[0].y)
                        mapped.drop(1).forEach { path.lineTo(it.x, it.y) }
                        drawPath(path, accent, style = Stroke(width = 4f))
                    }
                    mapped.forEach { drawCircle(accent, radius = 10f, center = it) }
                    drawLine(
                        Color.White.copy(alpha = 0.2f),
                        Offset(size.width / 2, 0f),
                        Offset(size.width / 2, size.height),
                        strokeWidth = 1f
                    )
                    drawLine(
                        Color.White.copy(alpha = 0.2f),
                        Offset(0f, size.height / 2),
                        Offset(size.width, size.height / 2),
                        strokeWidth = 1f
                    )
                }
                TextButton(onClick = { if (points.isNotEmpty()) points.removeAt(points.lastIndex) }) {
                    Text("Undo point")
                }
                TextButton(onClick = { points.clear() }) { Text("Clear") }
            }
        },
        confirmButton = {
            TextButton(onClick = {
                val count = points.size.coerceAtLeast(1)
                val step = durationMs.coerceAtLeast(count.toLong()) / count
                val xKeys = points.mapIndexed { i, p -> Keyframe(i * step, p.x, Easing.LINEAR) }
                val yKeys = points.mapIndexed { i, p -> Keyframe(i * step, p.y, Easing.LINEAR) }
                onSave(
                    KeyableFloat(points.first().x, xKeys),
                    KeyableFloat(points.first().y, yKeys)
                )
            }) { Text("Save path") }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } }
    )
}
