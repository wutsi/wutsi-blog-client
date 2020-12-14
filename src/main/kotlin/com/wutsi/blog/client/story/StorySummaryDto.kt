package com.wutsi.blog.client.story

import java.util.Date

data class StorySummaryDto(
    val id: Long = -1,
    val userId: Long = -1,
    val title: String? = null,
    val tagline: String? = null,
    val summary: String? = null,
    val thumbnailUrl: String? = null,
    val sourceUrl: String? = null,
    val wordCount: Int = 0,
    val readingMinutes: Int = 0,
    val language: String? = null,
    val status: StoryStatus = StoryStatus.draft,
    val creationDateTime: Date = Date(),
    val modificationDateTime: Date = Date(),
    val publishedDateTime: Date? = null,
    val slug: String = "",
    val topicId: Long? = null,
    val live: Boolean = false,
    val liveDateTime: Date? = null,
    val wppStatus: WPPStatus? = null,
    val wppRejectionReason: String? = null,
    val wppModificationDateTime: Date? = null,
    val scheduledPublishDateTime: Date? = null
)
