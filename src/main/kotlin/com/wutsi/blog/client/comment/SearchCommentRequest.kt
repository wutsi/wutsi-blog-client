package com.wutsi.blog.client.comment

data class SearchCommentRequest(
        val storyId: Long = -1,
        val limit: Int = 20,
        val offset: Int = -1
)
