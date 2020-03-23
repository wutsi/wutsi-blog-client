package com.wutsi.blog.client.story

import javax.validation.constraints.NotEmpty

data class PublishStoryRequest(
        @get:NotEmpty val tags: List<String> = emptyList()
)
