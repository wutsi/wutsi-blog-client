package com.wutsi.blog.client.stats

data class StatsUserDto(
        val type: StatsType = StatsType.viewers,
        val userId: Long = -1,
        val year: Int = 0,
        val month: Int = 0,
        val value: Long = 0
)
