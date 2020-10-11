package com.wutsi.blog.client.view

import org.jetbrains.annotations.NotNull


data class SearchPreferredAuthorRequest(
        val userId: Long? = null,
        val deviceId: String? = null
)
