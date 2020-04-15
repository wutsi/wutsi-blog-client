package com.wutsi.blog.client.user

import java.util.Date

data class UserDto(
        val id: Long = -1,
        val name: String = "",
        val fullName: String = "",
        val biography: String? = null,
        val email: String? = null,
        var pictureUrl: String? = null,
        var loginCount: Long = 0,
        val lastLoginDateTime: Date? = null,
        val creationDateTime: Date = Date(),
        val modificationDateTime: Date = Date(),
        val websiteUrl: String? = null,
        val accounts: List<AccountDto> = emptyList()
)
