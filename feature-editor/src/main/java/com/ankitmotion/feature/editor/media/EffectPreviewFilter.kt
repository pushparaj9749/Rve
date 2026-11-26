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
        val matrix = ColorMatrix().apply {
            setSaturation(saturation.coerceIn(0f, 3f))
            setScale(
                contrast.coerceIn(0f, 3f),
                contrast.coerceIn(0f, 3f),
                contrast.coerceIn(0f, 3f),
                1f
            )
        }
        return ColorFilter.colorMatrix(matrix)
    }
}
