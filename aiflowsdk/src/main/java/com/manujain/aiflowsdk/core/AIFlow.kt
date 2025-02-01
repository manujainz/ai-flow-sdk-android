package com.manujain.aiflowsdk.core

import kotlinx.coroutines.flow.Flow

/**
 * Interface for AI inference, providing methods for synchronous and streaming inference.
 */
interface AIFlow {

    /**
     * Performs AI inference with the given request and returns a response.
     *
     * @param request The request containing the input prompt and options.
     * @return The AI-generated response.
     */
    suspend fun infer(request: AIFlowRequest): AIFlowResponse

    /**
     * Performs AI inference in a streaming fashion, returning a Flow of responses.
     *
     * @param request The request containing the input prompt and options.
     * @return A Flow emitting AI-generated responses as they become available.
     */
    fun streamInfer(request: AIFlowRequest): Flow<AIFlowResponse>
}