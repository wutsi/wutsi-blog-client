package com.wutsi.blog.client.user

import java.util.Date

data class UserDto(
        val id: Long = -1,
        val fullName: String = "",
        val email: String = "",
        var pictureUrl: String? = null,
        val creationDateTime: Date = Date(),
        var modificationDateTime: Date = Date()
)
