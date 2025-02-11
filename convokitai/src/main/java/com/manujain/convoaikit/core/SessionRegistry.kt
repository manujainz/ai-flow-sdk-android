package com.manujain.convoaikit.core

import com.manujain.convoaikit.session.ChatSession

internal class SessionRegistry {

    private val sessions = mutableMapOf<String, ChatSession>()

    fun initSession(sessionID: String): ChatSession {
        return sessions[sessionID]!!
    }
}