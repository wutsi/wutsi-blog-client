package com.wutsi.blog.client.stats

import java.util.Date
import javax.validation.constraints.NotNull

data class SearchStatsRequest(
        @get:NotNull val targetId: Long? = null,
        @get:NotNull val startDate: Date? = null,
        @get:NotNull val endDate: Date? = null,
        @get:NotNull val type: StatsType? = null
)
