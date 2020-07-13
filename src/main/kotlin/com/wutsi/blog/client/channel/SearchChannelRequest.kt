package com.wutsi.blog.client.channel

import javax.validation.constraints.NotNull

data class SearchChannelRequest(
        @get:NotNull val userId: Long? = null
)
