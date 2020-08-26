package com.wutsi.blog.client.like

data class SearchLikeRequest(
        val storyIds: List<Long> = emptyList(),
        val userId: Long = -1
)
