package com.wutsi.blog.client.post

data class SearchPostResponse(
    val posts: List<PostSummaryDto> = emptyList()
)
