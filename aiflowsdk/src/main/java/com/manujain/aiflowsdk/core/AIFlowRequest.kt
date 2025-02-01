package com.manujain.aiflowsdk.core

/**
 * Represents a request for AI inference.
 *
 * @property prompt The input text or query for inference.
 * @property options Additional configuration options (e.g., model, temperature).
 */
data class AIFlowRequest(
    val prompt: String,
    val options: Map<String, Any>? = null
)