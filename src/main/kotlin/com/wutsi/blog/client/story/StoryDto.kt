package com.wutsi.blog.client.story

import java.util.Date

data class StoryDto(
        val id: Long? = -1,
        val userId: Long = -1,
        val title: String? = null,
        val summary: String? = null,
        val thumbmailUrl: String? = null,
        val sourceUrl: String? = null,
        val worldCount: Int = 0,
        val readingMinutes: Int = 0,
        val language: String? = null,
        val status: StoryStatus = StoryStatus.draft,
        val creationDateTime: Date = Date(),
        var modificationDateTime: Date = Date(),
        var publishedDateTime: Date? = null
)
