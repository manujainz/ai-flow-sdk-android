package com.manujain.convoaikit.providers

data class ChatGPTConfiguration(
    val apiKey: String,
    val model: String = "gpt-4"
) : ProviderConfiguration()
