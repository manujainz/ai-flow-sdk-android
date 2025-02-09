package com.manujain.convoaikit.annotations

/**
 * Annotation for fields that should be added as URL query parameters.
 *
 * @param value Optional query parameter name. If not provided, the field name will be used.
 */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class ConvoAIQuery(val value: String = "")
