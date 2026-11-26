package com.ankitmotion.feature.editor.media

import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import com.ankitmotion.core.model.EffectInstance

/**
 * Live preview approximation for shader effects.
 * Real GPU passes are wired in the export renderer; preview uses ColorMatrix so
 * slider changes are visible immediately.
 */
object EffectPreviewFilter {

    fun forEffects(effects: List<EffectInstance>): ColorFilter? {
        var saturation = 1f
        var contrast = 1f
        effects.filter { it.enabled }.forEach { effect ->
            effect.properties["saturation"]?.toFloatOrNull()?.let { saturation *= it }
            effect.properties["contrast"]?.toFloatOrNull()?.let { contrast *= it }
        }
        if (saturation == 1f && contrast == 1f) return null
        val s = saturation.coerceIn(0f, 3f)
        val c = contrast.coerceIn(0f, 3f)
        val matrix = ColorMatrix(
            floatArrayOf(
                c * (0.213f + 0.787f * s), c * (0.715f - 0.715f * s), c * (0.072f - 0.072f * s), 0f, 0f,
                c * (0.213f - 0.213f * s), c * (0.715f + 0.285f * s), c * (0.072f - 0.072f * s), 0f, 0f,
                c * (0.213f - 0.213f * s), c * (0.715f - 0.715f * s), c * (0.072f + 0.928f * s), 0f, 0f,
                0f, 0f, 0f, 1f, 0f
            )
        )
        return ColorFilter.colorMatrix(matrix)
    }
}
