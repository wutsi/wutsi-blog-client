package com.wutsi.blog.client.story

import com.wutsi.blog.client.SortOrder
import java.util.Date
import javax.validation.constraints.NotNull

data class SearchStoryRequest(
    @get:NotNull val siteId: Long? = 1L,
    val storyIds: List<Long> = emptyList(),
    val userIds: List<Long> = emptyList(),
    val status: StoryStatus? = null,
    val live: Boolean? = null,
    val topicId: Long? = null,
    val publishedStartDate: Date? = null,
    val publishedEndDate: Date? = null,
    val scheduledPublishedStartDate: Date? = null,
    val scheduledPublishedEndDate: Date? = null,
    val language: String? = null,
    val limit: Int = 20,
    val offset: Int = 0,
    val sortBy: StorySortStrategy = StorySortStrategy.recommended,
    val sortOrder: SortOrder = SortOrder.descending,
    val context: SearchStoryContext = SearchStoryContext(),
    val dedupUser: Boolean = false,
    val tags: List<String> = emptyList()
)
