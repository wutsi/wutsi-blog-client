package com.wutsi.blog.client.user

import javax.validation.constraints.NotNull

data class AuthenticateRequest(
        @get:NotNull val email: String? = null,
        @get:NotNull val fullName: String? = null,
        @get:NotNull val provider: String? = null,
        @get:NotNull val providerUserId: String? = null,
        val pictureUrl: String? = null
)
