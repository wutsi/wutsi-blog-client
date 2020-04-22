package com.wutsi.blog.client.stats

import java.util.Date
import javax.validation.constraints.NotNull

data class SearchStatsRequest(
        @get:NotNull val storyId: Long? = null,
        @get:NotNull val startDate: Date? = null,
        @get:NotNull val endDate: Date? = null,
        @get:NotNull val type: StatsType? = null
)
