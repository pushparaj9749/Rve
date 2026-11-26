package com.ankitmotion.core.model

import kotlinx.serialization.Serializable

@Serializable
data class Vector2(val x: Float = 0f, val y: Float = 0f)

@Serializable
enum class BlendingMode {
    NORMAL, MULTIPLY, SCREEN, OVERLAY, DARKEN, LIGHTEN, COLOR_DODGE, DIFFERENCE
}

@Serializable
enum class FillType { SOLID, GRADIENT, IMAGE, VIDEO }

@Serializable
enum class ShapeKind { RECT, ELLIPSE, TRIANGLE, STAR, POLYGON, LINE }

@Serializable
enum class TextAlign { START, CENTER, END }

@Serializable
data class StyledText(
    val text: String = "Text",
    val font: String = "System",
    val fontSize: Float = 48f,
    val color: String = "#FFFFFF",
    val bold: Boolean = false,
    val italic: Boolean = false,
    val align: TextAlign = TextAlign.START
)

@Serializable
data class StrokeStyle(
    val color: String = "#22D3EE",
    val width: Float = 2f
)

@Serializable
data class BorderStyle(
    val color: String = "#FFFFFF",
    val width: Float = 1f,
    val radius: Float = 0f
)

@Serializable
data class DropShadow(
    val color: String = "#000000",
    val blur: Float = 8f,
    val dx: Float = 0f,
    val dy: Float = 4f,
    val enabled: Boolean = false
)

@Serializable
data class GradientFill(
    val startColor: String = "#22D3EE",
    val endColor: String = "#FF8A3D",
    val angle: Float = 0f
)

@Serializable
data class SpeedPoint(val timeMs: Long = 0L, val speed: Float = 1f)

@Serializable
data class DrawingPath(
    val color: String = "#22D3EE",
    val width: Float = 6f,
    val points: List<Vector2> = emptyList()
)

@Serializable
data class Bookmark(val id: Long, val timeMs: Long, val label: String)
