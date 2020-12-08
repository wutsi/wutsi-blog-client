package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.share.CreateShareRequest
import com.wutsi.blog.client.share.CreateShareResponse
import com.wutsi.blog.sdk.ShareApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

internal class ShareApiImpl(
        private val http: Http,
        private val environment: WutsiEnvironment
) : ShareApi {
    override fun create(request: CreateShareRequest): CreateShareResponse =
            http.post(uri(), request, CreateShareResponse::class.java).body

    private fun uri(): String =
            "${environment.apiUrl}/v1/shares"
}
