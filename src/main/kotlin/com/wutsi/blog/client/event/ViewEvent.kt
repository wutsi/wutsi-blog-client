package com.wutsi.blog.client.event

import java.util.Date

data class ViewEvent (
        val userId: Long? = null,
        val storyId: Long = -1,
        val deviceId: String? = null,
        val eventDateTime: Date = Date()
)
