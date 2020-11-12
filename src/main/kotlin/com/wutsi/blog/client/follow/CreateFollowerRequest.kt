package com.wutsi.blog.client.follow

import javax.validation.constraints.NotNull

data class CreateFollowerRequest(
        @get:NotNull val userId: Long? = null,
        @get:NotNull val followerId: Long? = null
)
