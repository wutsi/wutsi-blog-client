package com.wutsi.blog.client.story

import javax.validation.constraints.NotNull

data class TranslateStoryResponse(
        val story: StoryDto = StoryDto()
)
