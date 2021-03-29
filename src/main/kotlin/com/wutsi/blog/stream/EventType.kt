package com.wutsi.blog.stream

enum class EventType(
    val urn: String
) {
    LIKED("urn:wutsi:like:1.0:liked"),
    UNLIKED("urn:wutsi:like:1.0:unliked"),
}
