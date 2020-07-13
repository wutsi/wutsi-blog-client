package com.wutsi.blog.client.channel

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class CreateChannelRequest(
        @get:NotNull val userId: Long? = null,
        @get:NotBlank var name: String = "",
        @get:NotBlank val accessToken: String = "",

        val type: ChannelType = ChannelType.unknown,
        val pictureUrl: String? = null
)
