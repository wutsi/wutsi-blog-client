package com.wutsi.blog.client.view

import javax.validation.constraints.NotNull


data class SearchViewRequest(
        @get:NotNull val storyIds: List<Long> = emptyList(),
        val userId: Long? = null
)
