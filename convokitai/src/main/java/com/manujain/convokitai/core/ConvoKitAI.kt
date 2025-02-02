package com.manujain.convokitai.core

/**
 * The top-level interface for AIFlowSDK.
 * It manages sessions by initializing and closing chat sessions.
 */
interface ConvoKitAI {

    /**
     * Initializes a new chat session with the given session ID.
     *
     * @param sessionId A unique identifier for the chat session.
     * @return An AIChatSession instance that encapsulates conversation operations.
     */
    fun initSession(sessionId: String): ChatSession

    /**
     * Closes an existing chat session.
     *
     * @param sessionId The unique identifier for the chat session to close.
     */
    fun closeSession(sessionId: String)
}