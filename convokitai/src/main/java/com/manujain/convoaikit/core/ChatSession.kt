package com.manujain.convoaikit.core

import kotlinx.coroutines.flow.Flow

/**
 * The session-bound interface for handling conversation operations.
 * It persists the chat history internally, so the developer only needs to send the current user message.
 */
interface ChatSession {

    /**
     * Sends a user message within the session and returns the AI-generated response.
     *
     * @param request The current user message encapsulated in an ConvoKitRequest.
     * @return The AI-generated response.
     */
    suspend fun sendMessage(request: ConvoAIKitRequest): ConvoAIKitResponse

    /**
     * Streams the AI's responses for the current message as a Flow.
     *
     * @param request The current user message encapsulated in an ConvoKitRequest.
     * @return A Flow emitting AI-generated responses.
     */
    fun streamMessage(request: ConvoAIKitRequest): Flow<ConvoAIKitResponse>
}