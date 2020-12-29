package com.wutsi.blog.client.post

import java.util.Date

data class UpdatePostRequest(
    val message: String? = null,
    val scheduledPostDateTime: Date = Date(),
    val includeLink: Boolean = true,
    val language: String? = null
)
