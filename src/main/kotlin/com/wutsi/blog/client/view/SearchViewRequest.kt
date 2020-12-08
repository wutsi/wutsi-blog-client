package com.wutsi.blog.client.view

data class SearchViewRequest(
    val storyIds: List<Long> = emptyList(),
    val userId: Long? = null,
    val deviceId: String? = null,
    val limit: Int = 100,
    val offset: Int = 0
)
