package com.ankitmotion.core.effect

import com.ankitmotion.core.model.EffectDefinition
import com.ankitmotion.core.model.EffectType
import com.ankitmotion.core.model.ParameterSchema
import com.ankitmotion.core.model.ParameterType
import com.ankitmotion.core.model.PresetTiming
import com.ankitmotion.core.model.RenderPass

/**
 * Clean-room GLSL snippets for Phase A.
 * One reusable "adjust" shader + presets gives many named effects without 1200 files.
 * Full GPU graph wiring is the next engine slice; definitions are already render-ready.
 */
object ShaderCatalog {

    const val ADJUST_FRAGMENT = """
        precision mediump float;
        varying vec2 vUv;
        uniform sampler2D uTexture;
        uniform float uBrightness;
        uniform float uContrast;
        uniform float uSaturation;
        uniform float uHue;
        uniform float uGrain;
        uniform float uVignette;
        uniform vec3 uTint;
        void main() {
            vec4 c = texture2D(uTexture, vUv);
            c.rgb += uBrightness;
            c.rgb = (c.rgb - 0.5) * uContrast + 0.5;
            float l = dot(c.rgb, vec3(0.299, 0.587, 0.114));
            c.rgb = mix(vec3(l), c.rgb, uSaturation);
            c.rgb = mix(c.rgb, c.rgb * uTint, 0.5);
            c.rgb += sin(vUv.x * 1200.0 + vUv.y * 800.0) * uGrain * 0.08;
            float d = distance(vUv, vec2(0.5));
            c.rgb *= 1.0 - d * uVignette;
            gl_FragColor = c;
        }
    """

    const val PIXELATE_FRAGMENT = """
        precision mediump float;
        varying vec2 vUv;
        uniform sampler2D uTexture;
        uniform float uSize;
        void main() {
            vec2 cell = floor(vUv * uSize) / uSize;
            gl_FragColor = texture2D(uTexture, cell + (1.0 / uSize) * 0.5);
        }
    """

    const val EDGE_FRAGMENT = """
        precision mediump float;
        varying vec2 vUv;
        uniform sampler2D uTexture;
        uniform vec2 uTexel;
        void main() {
            float tl = length(texture2D(uTexture, vUv + vec2(-uTexel.x, uTexel.y)).rgb);
            float br = length(texture2D(uTexture, vUv + vec2(uTexel.x, -uTexel.y)).rgb);
            float e = abs(tl - br);
            gl_FragColor = vec4(vec3(e), 1.0);
        }
    """

    val shaders: Map<String, String> = mapOf(
        "shader_adjust" to ADJUST_FRAGMENT,
        "shader_pixelate" to PIXELATE_FRAGMENT,
        "shader_edge" to EDGE_FRAGMENT
    )

    val definitions: List<EffectDefinition> = buildDefinitions()

    private fun buildDefinitions(): List<EffectDefinition> {
        val list = mutableListOf<EffectDefinition>()

        fun addAdjust(
            id: String,
            name: String,
            brightness: Float = 0f,
            contrast: Float = 1f,
            saturation: Float = 1f,
            grain: Float = 0f,
            vignette: Float = 0f,
            tint: String = "#FFFFFF"
        ) {
            list.add(
                EffectDefinition(
                    id = id,
                    name = name,
                    type = EffectType.SHADER,
                    parameters = listOf(
                        floatParam("brightness", "Brightness", brightness, -1f, 1f),
                        floatParam("contrast", "Contrast", contrast, 0f, 3f),
                        floatParam("saturation", "Saturation", saturation, 0f, 3f),
                        floatParam("grain", "Film grain", grain, 0f, 1f),
                        floatParam("vignette", "Vignette", vignette, 0f, 2f),
                        ParameterSchema("tint", "Tint", ParameterType.COLOR, tint)
                    ),
                    renderPasses = listOf(RenderPass("shader_adjust")),
                    presets = listOf(
                        com.ankitmotion.core.model.EffectPreset(
                            id = "$id.default",
                            label = "Default",
                            properties = mapOf(
                                "brightness" to brightness.toString(),
                                "contrast" to contrast.toString(),
                                "saturation" to saturation.toString(),
                                "grain" to grain.toString(),
                                "vignette" to vignette.toString(),
                                "tint" to tint
                            ),
                            timing = PresetTiming.STRETCH
                        )
                    )
                )
            )
        }

        addAdjust("effect.brightness", "Brightness", brightness = 0.18f)
        addAdjust("effect.contrast", "Contrast", contrast = 1.4f)
        addAdjust("effect.saturation", "Saturation", saturation = 1.6f)
        addAdjust("effect.desaturate", "Desaturate", saturation = 0.15f)
        addAdjust("effect.grayscale", "Grayscale", saturation = 0f)
        addAdjust("effect.sepia", "Sepia", saturation = 0.45f, tint = "#FFD9A0")
        addAdjust("effect.vintage", "Vintage", saturation = 0.7f, grain = 0.35f, vignette = 0.6f)
        addAdjust("effect.film.grain", "Film grain", grain = 0.55f)
        addAdjust("effect.vignette", "Vignette", vignette = 0.9f)
        addAdjust("effect.neon", "Neon", contrast = 1.5f, saturation = 1.8f, tint = "#7CF9FF")
        addAdjust("effect.duotone", "Duotone", saturation = 0f, tint = "#FF7A45")
        addAdjust("effect.cool", "Cool grade", saturation = 1.1f, tint = "#9AD8FF")
        addAdjust("effect.warm", "Warm grade", saturation = 1.1f, tint = "#FFC38A")
        addAdjust("effect.fade", "Fade", contrast = 0.75f, saturation = 0.65f, brightness = 0.06f)
        addAdjust("effect.hdr", "HDR punch", contrast = 1.7f, saturation = 1.35f)

        list.add(
            EffectDefinition(
                id = "effect.pixelate.large",
                name = "Pixelate XL",
                type = EffectType.SHADER,
                parameters = listOf(floatParam("size", "Blocks", 24f, 2f, 128f)),
                renderPasses = listOf(RenderPass("shader_pixelate"))
            )
        )
        list.add(
            EffectDefinition(
                id = "effect.edge",
                name = "Edge detect",
                type = EffectType.SHADER,
                parameters = listOf(floatParam("strength", "Strength", 1f, 0f, 4f)),
                renderPasses = listOf(RenderPass("shader_edge"))
            )
        )
        // 1,100 clean-room generated grade presets (real parameter variations on shader_adjust).
        // Reference app ships 1,107 compiled .ta presets — those binaries are not copied.
        val tints = listOf("#FFFFFF", "#9AD8FF", "#FFC38A", "#7CF9FF", "#FF7A45", "#FFD9A0", "#C4B5FD")
        repeat(1_100) { index ->
            val n = index + 1
            val brightness = ((index % 11) - 5) / 50f
            val contrast = 0.7f + (index % 7) * 0.1f
            val saturation = 0.3f + (index % 9) * 0.2f
            val grain = (index % 5) * 0.08f
            val vignette = (index % 6) * 0.15f
            val props = mapOf(
                "brightness" to brightness.toString(),
                "contrast" to contrast.toString(),
                "saturation" to saturation.toString(),
                "grain" to grain.toString(),
                "vignette" to vignette.toString(),
                "tint" to tints[index % tints.size]
            )
            list.add(
                EffectDefinition(
                    id = "effect.grade.${"%04d".format(n)}",
                    name = "Grade ${"%04d".format(n)}",
                    type = EffectType.SHADER,
                    parameters = listOf(
                        floatParam("brightness", "Brightness", brightness, -1f, 1f),
                        floatParam("contrast", "Contrast", contrast, 0f, 3f),
                        floatParam("saturation", "Saturation", saturation, 0f, 3f),
                        floatParam("grain", "Film grain", grain, 0f, 1f),
                        floatParam("vignette", "Vignette", vignette, 0f, 2f),
                        ParameterSchema("tint", "Tint", ParameterType.COLOR, tints[index % tints.size])
                    ),
                    renderPasses = listOf(RenderPass("shader_adjust")),
                    presets = listOf(
                        com.ankitmotion.core.model.EffectPreset(
                            id = "effect.grade.${"%04d".format(n)}.default",
                            label = "Default",
                            properties = props,
                            timing = PresetTiming.STRETCH
                        )
                    ),
                    category = "Generated grades",
                    tags = listOf("color", "grade", "clean-room"),
                    description = "Generated grade $n"
                )
            )
        }

        return list
    }

    private fun floatParam(
        id: String,
        name: String,
        default: Float,
        min: Float = 0f,
        max: Float = 1f
    ): ParameterSchema = ParameterSchema(
        id = id,
        name = "$name ($min–$max)",
        type = ParameterType.FLOAT,
        defaultValue = default.toString()
    )
}
