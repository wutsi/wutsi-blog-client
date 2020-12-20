package com.wutsi.blog.client.post

import com.wutsi.blog.client.channel.ChannelType
import com.wutsi.blog.client.channel.ChannelType.unknown
import com.wutsi.blog.client.post.PostStatus.pending
import java.util.Date

data class PostSummaryDto(
    val id: Long = -1,
    val storyId: Long = -1,
    val channelType: ChannelType = unknown,
    val status: PostStatus = pending,
    val scheduledPostDateTime: Date = Date(),
    val modificationDateTime: Date = Date()
)
