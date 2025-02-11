package com.manujain.convoaikit.core

import android.content.Context

object ConvoAIKit {

    private val sessionRegistry = SessionRegistry()

    lateinit var appContext: Context

    fun initialise(context: Context) {
        appContext = context.applicationContext
    }
}