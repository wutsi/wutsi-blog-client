package com.wutsi.blog.client.user

import java.util.Date

data class UserSummaryDto(
        val id: Long = -1,
        val name: String = "",
        val fullName: String = "",
        var pictureUrl: String? = null,
        val creationDateTime: Date = Date(),
        val modificationDateTime: Date = Date()
)
