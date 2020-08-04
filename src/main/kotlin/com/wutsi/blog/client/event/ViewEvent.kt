package com.wutsi.blog.client.event

import java.util.Date

data class ViewEvent (
        val userId: Long?,
        val storyId: Long,
        val deviceId: String?,
        val eventDateTime: Date
)
