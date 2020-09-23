package com.wutsi.blog.client.stats

data class SearchMonthlyStatsUserResponse(
        val stats: List<MonthlyStatsUserDto> = emptyList()
)
