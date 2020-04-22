package com.wutsi.blog.client.stats

import java.util.Date

data class StatsDto(
        val type: StatsType = StatsType.viewers,
        val storyId: Long = -1,
        val date: Date = Date(),
        val value: Long = 0
)
