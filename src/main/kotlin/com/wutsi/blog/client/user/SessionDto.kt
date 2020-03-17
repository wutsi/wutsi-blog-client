package com.wutsi.blog.client.user

import java.util.Date

data class SessionDto(
        val token: String = "",
        val accountId: Long = -1,
        val user: UserDto = UserDto(),
        val loginDateTime: Date = Date(),
        var logoutDateTime: Date? = null
)
