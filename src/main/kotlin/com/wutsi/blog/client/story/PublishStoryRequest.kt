package com.wutsi.blog.client.story

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class PublishStoryRequest(
        @get:NotBlank val title: String = "",
        @get:NotBlank val summary: String = "",
        val tagline: String? = null,
        @get:NotNull val topidId: Long? = null,
        @get:NotEmpty val tags: List<String> = emptyList(),
        val socialMediaMessage: String? = null
)
