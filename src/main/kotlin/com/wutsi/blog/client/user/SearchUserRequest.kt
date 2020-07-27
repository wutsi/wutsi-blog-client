package com.wutsi.blog.client.user

data class SearchUserRequest(
        val userIds: List<Long> = emptyList(),
        val limit: Int = 20,
        val offset: Int = 0,
        val blog: Boolean? = null
)
