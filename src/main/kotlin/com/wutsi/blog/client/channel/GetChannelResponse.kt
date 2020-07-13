package com.wutsi.blog.client.channel

import com.wutsi.blog.client.story.StoryDto

data class GetChannelResponse(
        val channel: ChannelDto = ChannelDto()
)
