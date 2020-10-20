package com.wutsi.blog.client.stats

data class MonthlyTrafficStoryDto(
        val storyId: Long = -1,
        val source: String = "",
        val year: Int = 0,
        val month: Int = 0,
        val value: Long = 0
)
