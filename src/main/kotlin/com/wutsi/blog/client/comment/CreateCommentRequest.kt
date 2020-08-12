package com.wutsi.blog.client.comment

import javax.validation.constraints.NotBlank

data class CreateCommentRequest(
        val userId: Long = -1,
        val storyId: Long = -1,
        @get:NotBlank val text: String = ""
)
