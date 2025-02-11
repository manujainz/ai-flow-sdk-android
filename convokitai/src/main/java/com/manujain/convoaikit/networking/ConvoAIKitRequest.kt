package com.manujain.convoaikit.networking

/**
 * Represents a request for AI inference.
 *
 * @property prompt The input text or query for inference.
 * @property options Additional configuration options (e.g., model, temperature).
 */
data class ConvoAIKitRequest(
    val prompt: String,
    val options: Map<String, Any>? = null
)