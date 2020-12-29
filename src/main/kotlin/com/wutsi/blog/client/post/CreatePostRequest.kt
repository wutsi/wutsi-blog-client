package com.wutsi.blog.client.post

import com.wutsi.blog.client.channel.ChannelType
import java.util.Date
import javax.validation.constraints.Future
import javax.validation.constraints.NotNull

data class CreatePostRequest(
    @get:NotNull val storyId: Long? = null,
    @get:NotNull val channelType: ChannelType? = null,
    @get:NotNull @get:Future val scheduledPostDateTime: Date? = null,
    val message: String? = null,
    val includeLink: Boolean = true,
    val language: String? = null
)
