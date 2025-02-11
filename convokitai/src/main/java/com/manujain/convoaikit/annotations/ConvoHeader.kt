package com.manujain.convoaikit.annotations

/**
 * Annotation for fields that should be included as HTTP headers.
 *
 * @param value Optional header name. If not provided, the field name will be used.
 */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class ConvoHeader(val value: String = "") {
}