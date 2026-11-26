package com.ankitmotion.core.model

import kotlin.math.PI
import kotlin.math.sin

/** Pure interpolation helper — no Android dependency, easy to unit test. */
object KeyframeEvaluator {

    fun evaluate(animated: KeyableFloat, timeMs: Long): Float {
        val points = animated.keyframes.sortedBy { it.timeMs }
        if (points.isEmpty()) return animated.value
        if (timeMs <= points.first().timeMs) return points.first().value
        if (timeMs >= points.last().timeMs) return points.last().value

        for (i in 0 until points.size - 1) {
            val a = points[i]
            val b = points[i + 1]
            if (timeMs in a.timeMs..b.timeMs) {
                val span = (b.timeMs - a.timeMs).coerceAtLeast(1L)
                val t = (timeMs - a.timeMs).toFloat() / span.toFloat()
                return a.value + (b.value - a.value) * easing(a.easing, t)
            }
        }
        return animated.value
    }

    fun transformAt(transform: KeyableTransform, timeMs: Long): TransformValues = TransformValues(
        x = evaluate(transform.x, timeMs),
        y = evaluate(transform.y, timeMs),
        scaleX = evaluate(transform.scaleX, timeMs),
        scaleY = evaluate(transform.scaleY, timeMs),
        rotation = evaluate(transform.rotation, timeMs)
    )

    data class TransformValues(
        val x: Float,
        val y: Float,
        val scaleX: Float,
        val scaleY: Float,
        val rotation: Float
    )

    private fun easing(type: Easing, t: Float): Float = when (type) {
        Easing.LINEAR -> t
        Easing.EASE_IN -> t * t
        Easing.EASE_OUT -> 1f - (1f - t) * (1f - t)
        Easing.EASE_IN_OUT -> if (t < 0.5f) 2f * t * t else run { val u = -2f * t + 2f; 1f - u * u / 2f }
        Easing.STEP -> if (t < 0.5f) 0f else 1f
        Easing.BOUNCE -> bounce(t)
        Easing.ELASTIC -> elastic(t)
    }

    private fun bounce(input: Float): Float {
        val n1 = 7.5625f
        val d1 = 2.75f
        val t = input
        return when {
            t < 1f / d1 -> n1 * t * t
            t < 2f / d1 -> {
                val x = t - 1.5f / d1
                n1 * x * x + 0.75f
            }
            t < 2.5f / d1 -> {
                val x = t - 2.25f / d1
                n1 * x * x + 0.9375f
            }
            else -> {
                val x = t - 2.625f / d1
                n1 * x * x + 0.984375f
            }
        }
    }

    private fun elastic(t: Float): Float = when (t) {
        0f -> 0f
        1f -> 1f
        else -> (2f).pow(-10f * t) * sin((t * 10f - 0.75f) * (2f * PI.toFloat()) / 3f) + 1f
    }

    private fun Float.pow(exponent: Float): Float = Math.pow(this.toDouble(), exponent.toDouble()).toFloat()
}
