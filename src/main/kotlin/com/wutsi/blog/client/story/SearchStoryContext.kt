package com.wutsi.blog.client.story

data class SearchStoryContext(
    val userId: Long? = null,
    val deviceId: String? = null,
    val deviceType: String? = null,
    val traffic: String? = null
)