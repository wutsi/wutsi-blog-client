package com.wutsi.blog.client.comment

import javax.validation.constraints.NotEmpty

data class CountCommentRequest(
        @get:NotEmpty() val storyIds: List<Long> = emptyList()
)
