package com.manujain.convoaikit.providers

data class ClaudeConfiguration(
    val apiKey: String,
    val endpoint: String = "https://api.anthropic.com"
) : ProviderConfiguration()
