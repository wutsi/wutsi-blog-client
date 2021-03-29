package com.wutsi.blog.stream

enum class EventType(
    val urn: String
) {
    LIKED("urn:wutsi:1.0:like:liked"),
    UNLIKED("urn:wutsi:1.0:like:unliked"),
}
