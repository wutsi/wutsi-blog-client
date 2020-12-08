package com.wutsi.blog.client.like

import javax.validation.constraints.NotNull

data class CreateLikeRequest(
    @get:NotNull val userId: Long? = null,
    @get:NotNull val storyId: Long? = null
)
