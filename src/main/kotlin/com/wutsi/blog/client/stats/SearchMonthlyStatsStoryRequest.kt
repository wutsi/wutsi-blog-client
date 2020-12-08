package com.wutsi.blog.client.stats

import javax.validation.constraints.NotNull

data class SearchMonthlyStatsStoryRequest(
    @get:NotNull val year: Int? = null,
    val month: Int? = null,
    val userId: Long? = null,
    val storyIds: List<Long> = emptyList(),
    val type: StatsType? = null
)
