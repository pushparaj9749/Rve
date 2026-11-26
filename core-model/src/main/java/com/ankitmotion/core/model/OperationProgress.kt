package com.ankitmotion.core.model

/** Progress/message state for long-running local jobs (reverse, export). */
data class OperationProgress(
    val running: Boolean = false,
    val progress: Float = 0f,
    val message: String? = null,
    val outputPath: String? = null
)
