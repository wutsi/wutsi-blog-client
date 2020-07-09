package com.wutsi.blog.client.story

import com.wutsi.blog.client.SortOrder
import java.util.Date


data class SearchStoryRequest(
        val storyIds: List<Long> = emptyList(),
        val userId: Long? = null,
        val status: StoryStatus? = null,
        val live: Boolean? = null,
        val topicId: Long? = null,
        val publishedStartDate: Date? = null,
        val publishedEndDate: Date? = null,
        val language: String? = null,
        val limit: Int = 20,
        val offset: Int = 0,
        val sortBy: StorySortStrategy = StorySortStrategy.modified,
        val sortOrder: SortOrder = SortOrder.descending,
        val minViewers: Int? = null
)
