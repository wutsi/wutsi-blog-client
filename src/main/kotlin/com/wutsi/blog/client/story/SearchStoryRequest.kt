package com.wutsi.blog.client.story

data class SearchStoryRequest(
        val userId: Long? = null,
        val status: StoryStatus? = null,
        val limit: Int = 20,
        val offset: Int = 0
)
