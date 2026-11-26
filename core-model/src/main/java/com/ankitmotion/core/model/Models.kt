package com.ankitmotion.core.model

import kotlinx.serialization.Serializable

/** Project-level metadata shown on the home screen. */
@Serializable
data class ProjectMeta(
    val id: String,
    val title: String,
    val createdAt: Long,
    val modifiedAt: Long,
    val width: Int,
    val height: Int,
    val fps: Int
)

/** One editable composition. Clean-room model, inspired by observed behaviour only. */
@Serializable
data class Scene(
    val id: String = "scene_main",
    val title: String = "Untitled",
    val width: Int = 1080,
    val height: Int = 1920,
    val fps: Int = 30,
    val durationMs: Long = 5_000L,
    val backgroundColor: String = "#12121A",
    val elements: List<SceneElement> = emptyList(),
    val bookmarks: List<Bookmark> = emptyList(),
    val thumbnailTimeMs: Long = 0L,
    val exportWidth: Int = width,
    val exportHeight: Int = height,
    val formatVersion: Int = 2
)

@Serializable
enum class ElementType {
    SHAPE, TEXT, IMAGE, VIDEO, AUDIO, DRAWING, CAMERA, NESTED_SCENE, STICKER, NULL_OBJECT
}

@Serializable
enum class Easing {
    LINEAR, EASE_IN, EASE_OUT, EASE_IN_OUT, BOUNCE, ELASTIC, STEP
}

@Serializable
data class Keyframe(
    val timeMs: Long,
    val value: Float,
    val easing: Easing = Easing.LINEAR
)

@Serializable
data class KeyableFloat(
    val value: Float = 0f,
    val keyframes: List<Keyframe> = emptyList()
)

@Serializable
data class KeyableTransform(
    val x: KeyableFloat = KeyableFloat(0f),
    val y: KeyableFloat = KeyableFloat(0f),
    val scaleX: KeyableFloat = KeyableFloat(1f),
    val scaleY: KeyableFloat = KeyableFloat(1f),
    val rotation: KeyableFloat = KeyableFloat(0f)
)

/** One layer on the timeline. */
@Serializable
data class SceneElement(
    val id: Long,
    val label: String = "Layer",
    val type: ElementType = ElementType.SHAPE,
    val startMs: Long = 0L,
    val endMs: Long = 2_000L,
    val sourceUri: String? = null,
    val transform: KeyableTransform = KeyableTransform(),
    val opacity: KeyableFloat = KeyableFloat(1f),
    val effects: List<EffectInstance> = emptyList(),
    // --- After Motion Z+ parity fields (clean-room) ---
    val hidden: Boolean = false,
    val loop: Boolean = false,
    val tag: String = "",
    val text: StyledText? = null,
    val drawing: DrawingPath? = null,
    val shapeKind: ShapeKind = ShapeKind.RECT,
    val fillType: FillType = FillType.SOLID,
    val fillColor: String = "#22D3EE",
    val gradient: GradientFill? = null,
    val stroke: StrokeStyle? = null,
    val border: BorderStyle? = null,
    val shadow: DropShadow? = null,
    val blendingMode: BlendingMode = BlendingMode.NORMAL,
    val speedMap: List<SpeedPoint> = emptyList(),
    val nestedSceneId: String? = null
)

// ---------- Effects ----------

@Serializable
enum class EffectType { DRAWING, SHADER, TEXT, SCRIPT }

@Serializable
enum class PresetTiming { START, END, SPLIT, STRETCH, EXTEND, EXTEND_MATCH }

@Serializable
enum class ParameterType { FLOAT, COLOR, VECTOR2, URI, BOOLEAN }

@Serializable
data class ParameterSchema(
    val id: String,
    val name: String,
    val type: ParameterType,
    val defaultValue: String
)

@Serializable
data class RenderPass(
    val shaderId: String,
    val input: String = "input",
    val output: String = "output"
)

@Serializable
data class EffectPreset(
    val id: String,
    val label: String,
    val properties: Map<String, String> = emptyMap(),
    val timing: PresetTiming = PresetTiming.STRETCH
)

@Serializable
data class EffectDefinition(
    val id: String,
    val name: String,
    val type: EffectType,
    val parameters: List<ParameterSchema> = emptyList(),
    val renderPasses: List<RenderPass> = emptyList(),
    val presets: List<EffectPreset> = emptyList(),
    val affinity: Set<ElementType> = ElementType.entries.toSet(),
    val category: String = "General",
    val tags: List<String> = emptyList(),
    val description: String = ""
)

@Serializable
data class EffectInstance(
    val definitionId: String,
    val instanceId: Long,
    val properties: Map<String, String> = emptyMap(),
    val timing: PresetTiming = PresetTiming.STRETCH,
    val enabled: Boolean = true,
    val renderGroup: Int = 0
)

// ---------- Reverse (new differentiator) ----------

@Serializable
data class ReverseSettings(
    val reverseVideo: Boolean = true,
    val reverseAudio: Boolean = true,
    val preserveDuration: Boolean = true
)

/** New-project form values. */
data class NewProjectRequest(
    val title: String,
    val width: Int,
    val height: Int,
    val fps: Int
)
