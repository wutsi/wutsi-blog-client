package com.wutsi.blog.client.user

import com.wutsi.blog.client.SortOrder

data class SearchUserRequest(
        val userIds: List<Long> = emptyList(),
        val limit: Int = 20,
        val offset: Int = 0,
        val sortBy: UserSortStrategy = UserSortStrategy.created,
        val sortOrder: SortOrder = SortOrder.ascending,
        val blog: Boolean? = null,
        val autoFollowedByBlogs: Boolean? = null
)
