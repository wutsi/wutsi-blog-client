package com.wutsi.blog.client.story

import javax.validation.constraints.NotNull


data class RecommendStoryRequest(
        @get:NotNull val storyId: Long? = null,
        val userId: Long? = null,
        val deviceId: String? = null,
        val language: String? = null,
        val limit: Int = 20
)
