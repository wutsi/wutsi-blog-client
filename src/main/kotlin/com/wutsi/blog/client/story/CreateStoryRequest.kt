package com.wutsi.blog.client.story

import javax.validation.constraints.NotNull

data class CreateStoryRequest(
        @get:NotNull val accessToken: String
)
