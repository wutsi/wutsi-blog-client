package com.wutsi.blog.client.stats

data class SearchDailyStatsResponse(
        val stats: List<DailyStatsDto> = emptyList()
)
