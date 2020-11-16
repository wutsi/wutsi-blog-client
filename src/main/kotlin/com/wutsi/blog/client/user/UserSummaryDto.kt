package com.wutsi.blog.client.user

import java.util.Date

data class UserSummaryDto(
        val id: Long = -1,
        val name: String = "",
        val blog: Boolean = false,
        val fullName: String = "",
        val pictureUrl: String? = null,
        val biography: String? = null,
        val creationDateTime: Date = Date(),
        val modificationDateTime: Date = Date()
)
