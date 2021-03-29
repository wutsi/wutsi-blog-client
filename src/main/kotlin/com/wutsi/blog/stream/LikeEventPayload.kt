package com.wutsi.blog.stream

import java.time.OffsetDateTime

data class LikeEventPayload(
    val likeId: Long = -1,
    val storyId: Long = -1,
    val deviceUUID: String? = null,
    val userId: Long? = null,
    val likeDateTime: OffsetDateTime = OffsetDateTime.now()
)
