package com.wutsi.blog.client.stats

data class StatsStoryDto(
        val type: StatsType = StatsType.viewers,
        val storyId: Long = -1,
        val year: Int = 0,
        val month: Int = 0,
        val day: Int = 0,
        val value: Long = 0
)
