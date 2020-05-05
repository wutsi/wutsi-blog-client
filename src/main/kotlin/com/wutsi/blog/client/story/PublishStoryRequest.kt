package com.wutsi.blog.client.story

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class PublishStoryRequest(
        @get:NotNull val topidId: Long? = null,
        @get:NotEmpty val tags: List<String> = emptyList()
)
