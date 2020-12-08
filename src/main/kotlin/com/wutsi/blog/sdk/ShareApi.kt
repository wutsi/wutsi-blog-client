package com.wutsi.blog.sdk

import com.wutsi.blog.client.share.CreateShareRequest
import com.wutsi.blog.client.share.CreateShareResponse

interface ShareApi {
    fun create(request: CreateShareRequest): CreateShareResponse
}
