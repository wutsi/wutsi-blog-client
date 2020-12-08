package com.wutsi.blog.client.share

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class CreateShareRequest(
    val userId: Long? = null,
    @get:NotNull val storyId: Long? = null,

    @get:NotEmpty var target: String = "",
    @get:NotEmpty var deviceId: String = ""
)
