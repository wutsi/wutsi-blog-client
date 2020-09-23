package com.wutsi.blog.client.stats

import java.util.Date
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class SearchDailyStatsRequest(
        @get:NotEmpty val targetIds: List<Long> = emptyList(),
        @get:NotNull val startDate: Date? = null,
        @get:NotNull val endDate: Date? = null,
        @get:NotNull val type: StatsType? = null
)
