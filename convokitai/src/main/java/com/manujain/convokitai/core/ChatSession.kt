package com.manujain.convokitai.core

import kotlinx.coroutines.flow.Flow

/**
 * The session-bound interface for handling conversation operations.
 * It persists the chat history internally, so the developer only needs to send the current user message.
 */
interface ChatSession {

    /**
     * Sends a user message within the session and returns the AI-generated response.
     *
     * @param request The current user message encapsulated in an AIFlowRequest.
     * @return The AI-generated response.
     */
    suspend fun sendMessage(request: ConvoKitRequest): ConvoKitResponse

    /**
     * Streams the AI's responses for the current message as a Flow.
     *
     * @param request The current user message encapsulated in an AIFlowRequest.
     * @return A Flow emitting AI-generated responses.
     */
    fun streamMessage(request: ConvoKitRequest): Flow<ConvoKitResponse>
}