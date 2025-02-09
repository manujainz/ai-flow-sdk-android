package com.manujain.convoaikit.annotations

/**
 * Annotation for fields that should be serialized into the request body.
 */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class ConvoAIBody