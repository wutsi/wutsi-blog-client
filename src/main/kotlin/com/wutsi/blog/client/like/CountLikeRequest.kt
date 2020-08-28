package com.wutsi.blog.client.like

import javax.validation.constraints.NotEmpty

data class CountLikeRequest(
        @get:NotEmpty() val storyIds: List<Long> = emptyList()
)
