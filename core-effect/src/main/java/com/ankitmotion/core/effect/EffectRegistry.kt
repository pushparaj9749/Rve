package com.ankitmotion.core.effect

import com.ankitmotion.core.model.EffectDefinition
import com.ankitmotion.core.model.EffectInstance
import com.ankitmotion.core.model.EffectPreset
import com.ankitmotion.core.model.EffectType
import com.ankitmotion.core.model.ElementType
import com.ankitmotion.core.model.ParameterSchema
import com.ankitmotion.core.model.ParameterType
import com.ankitmotion.core.model.PresetTiming
import com.ankitmotion.core.model.RenderPass

/**
 * Extensible effect registry for Ankit motion+.
 * Phase A ships a small set; more effects are added here without touching UI/editor code.
 */
object EffectRegistry {
    private val definitions: MutableMap<String, EffectDefinition> = linkedMapOf()

    init {
        add(
            EffectDefinition(
                id = "effect.blur",
                name = "Blur",
                type = EffectType.SHADER,
                parameters = listOf(
                    ParameterSchema("amount", "Amount", ParameterType.FLOAT, "4.0"),
                    ParameterSchema("edge", "Edge fade", ParameterType.FLOAT, "0.5")
                ),
                renderPasses = listOf(RenderPass("shader_blur")),
                presets = listOf(
                    EffectPreset("blur.soft", "Soft", mapOf("amount" to "2.0"), PresetTiming.STRETCH),
                    EffectPreset("blur.strong", "Strong", mapOf("amount" to "10.0"), PresetTiming.STRETCH)
                )
            )
        )
        add(
            EffectDefinition(
                id = "effect.glow",
                name = "Glow",
                type = EffectType.SHADER,
                parameters = listOf(
                    ParameterSchema("radius", "Radius", ParameterType.FLOAT, "12.0"),
                    ParameterSchema("color", "Color", ParameterType.COLOR, "#FFFFFF")
                ),
                renderPasses = listOf(RenderPass("shader_glow")),
                presets = listOf(EffectPreset("glow.default", "Default", mapOf("radius" to "12.0")))
            )
        )
        ShaderCatalog.definitions.forEach { add(it) }
        add(
            EffectDefinition(
                id = "effect.pixelate",
                name = "Pixelate",
                type = EffectType.SHADER,
                parameters = listOf(ParameterSchema("size", "Pixel size", ParameterType.FLOAT, "8.0")),
                renderPasses = listOf(RenderPass("shader_pixelate")),
                presets = listOf(EffectPreset("pixelate.default", "Default", mapOf("size" to "8.0"))),
                affinity = setOf(ElementType.IMAGE, ElementType.VIDEO, ElementType.SHAPE)
            )
        )
    }

    fun add(definition: EffectDefinition) {
        val enriched = if (definition.category == "General") {
            definition.copy(
                category = categoryFor(definition.id),
                tags = definition.tags.ifEmpty { listOf(categoryFor(definition.id)) },
                description = definition.description.ifBlank { definition.name }
            )
        } else definition
        definitions[enriched.id] = enriched
    }

    private fun categoryFor(id: String): String = when {
        id.contains("blur") || id.contains("pixelate") || id.contains("sharpen") -> "Blur & sharpen"
        id.contains("glow") || id.contains("neon") || id.contains("hdr") -> "Light"
        id.contains("grain") || id.contains("vintage") || id.contains("fade") -> "Film"
        id.contains("grayscale") || id.contains("sepia") || id.contains("duotone") ||
            id.contains("cool") || id.contains("warm") || id.contains("saturation") ||
            id.contains("desaturate") || id.contains("brightness") || id.contains("contrast") -> "Color"
        id.contains("edge") -> "Stylize"
        else -> "General"
    }

    fun all(): List<EffectDefinition> = definitions.values.toList()

    /** GLSL sources for the GPU renderer (engine slice). */
    fun shaders(): Map<String, String> = ShaderCatalog.shaders

    fun get(id: String): EffectDefinition? = definitions[id]

    fun createInstance(definitionId: String, instanceId: Long): EffectInstance? {
        val def = definitions[definitionId] ?: return null
        return EffectInstance(
            definitionId = def.id,
            instanceId = instanceId,
            properties = def.presets.firstOrNull()?.properties.orEmpty(),
            timing = def.presets.firstOrNull()?.timing ?: PresetTiming.STRETCH
        )
    }

    /** Long-term target: 1200+ definitions. Phase A starts small. */
    val targetSize: Int = 1200
}
