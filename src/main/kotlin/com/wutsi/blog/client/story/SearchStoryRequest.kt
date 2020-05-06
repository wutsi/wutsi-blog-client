package com.wutsi.blog.client.story

import com.wutsi.blog.client.SortOrder


data class SearchStoryRequest(
        val userId: Long? = null,
        val status: StoryStatus? = null,
        val live: Boolean? = null,
        val limit: Int = 20,
        val offset: Int = 0,
        val sortBy: StorySortStrategy = StorySortStrategy.modified,
        val sortOrder: SortOrder = SortOrder.descending
)
