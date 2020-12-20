package com.wutsi.blog.client.post

import javax.validation.constraints.NotNull

data class SetPostPictureRequest(
    @get:NotNull val pictureUrl: String? = null
)
