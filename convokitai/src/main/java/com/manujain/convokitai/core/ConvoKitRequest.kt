package com.manujain.convokitai.core

/**
 * Represents a request for AI inference.
 *
 * @property prompt The input text or query for inference.
 * @property options Additional configuration options (e.g., model, temperature).
 */
data class ConvoKitRequest(
    val prompt: String,
    val options: Map<String, Any>? = null
)