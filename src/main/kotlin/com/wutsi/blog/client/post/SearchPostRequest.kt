package com.wutsi.blog.client.post

import java.util.Date

data class SearchPostRequest(
    val userId: Long? = null,
    val storyId: Long? = null,
    val status: PostStatus? = null,
    val scheduledPostStartDateTime: Date? = null,
    val scheduledPostEndDateTime: Date? = null,
    val limit: Int = 20,
    val offset: Int = 0
)
