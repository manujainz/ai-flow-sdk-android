package com.manujain.convoaikit.core

/**
 * Represents a response from AI inference.
 *
 * @property text The AI-generated text output.
 * @property metadata Additional metadata (e.g., model info, response time).
 */
data class ConvoAIKitResponse(
    val text: String,
    val metadata: Map<String, Any>? = null
)