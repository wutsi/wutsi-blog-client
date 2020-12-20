package com.wutsi.blog.client.post

import com.wutsi.blog.client.channel.ChannelType
import com.wutsi.blog.client.channel.ChannelType.unknown
import com.wutsi.blog.client.post.PostStatus.pending
import java.util.Date

data class PostDto(
    val id: Long = -1,
    val storyId: Long = -1,
    val channelType: ChannelType = unknown,
    val status: PostStatus = pending,
    val message: String? = null,
    val pictureUrl: String? = null,
    val socialPostId: String? = null,
    val scheduledPostDateTime: Date = Date(),
    val postDateTime: Date? = null,
    val modificationDateTime: Date = Date()
)
