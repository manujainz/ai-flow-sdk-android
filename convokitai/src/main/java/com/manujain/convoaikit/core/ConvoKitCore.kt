package com.manujain.convoaikit.core

import android.content.Context
import com.manujain.convoaikit.session.ChatSession

internal interface ConvoKitCore {
    fun getContext(): Context

    fun getSession(sessionId: String): ChatSession

    fun getTotalSessionCount(): Int
}