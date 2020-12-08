package com.wutsi.blog.client.stats

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class SearchOverallStatsRequest(
    @get:NotEmpty val targetIds: List<Long> = emptyList(),
    @get:NotNull val type: StatsType? = null
)
