package com.wutsi.blog.client.stats

import javax.validation.constraints.NotNull

data class SearchMonthlyStatsUserRequest(
        @get:NotNull val userId: Long? = null,
        @get:NotNull val year: Int? = null,
        @get:NotNull val month: Int? = null,
        val type: StatsType? = null
)
