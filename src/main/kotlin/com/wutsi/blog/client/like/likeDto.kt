package com.wutsi.blog.client.like

import java.util.*

data class LikeDto(
        val id: Long = -1,
        val userId: Long = -1,
        val storyId: Long = -1,
        val likeDateTime: Date = Date()
)