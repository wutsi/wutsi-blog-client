package com.wutsi.blog.client.user

import javax.validation.constraints.NotNull

data class AuthenticateRequest(
        @get:NotNull val provider: String? = null,
        @get:NotNull val providerUserId: String? = null,
        @get:NotNull val fullName: String? = null,
        val email: String? = null,
        val pictureUrl: String? = null,
        @get:NotNull val accessToken: String? = null,
        val refreshToken: String? = null
)
