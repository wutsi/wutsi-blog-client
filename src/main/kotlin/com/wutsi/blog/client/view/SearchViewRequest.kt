package com.wutsi.blog.client.view

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


data class SearchViewRequest(
        @get:NotNull @get:NotEmpty val storyIds: List<Long> = emptyList(),
        val userId: Long? = null,
        val deviceId: String? = null
)
