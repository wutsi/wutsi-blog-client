package com.wutsi.blog.client.stats

data class OverallStatsDto(
    val type: StatsType = StatsType.viewers,
    val targetId: Long = -1,
    val value: Long = 0
)
