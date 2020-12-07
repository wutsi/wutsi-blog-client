package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.pin.CreatePinRequest
import com.wutsi.blog.client.pin.CreatePinResponse
import com.wutsi.blog.client.pin.SearchPinResponse
import com.wutsi.blog.client.user.SessionDto
import com.wutsi.blog.sdk.PinApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

class PinApiImpl(
        private val http: Http,
        private val session: SessionDto,
        private val environment: WutsiEnvironment
): PinApi {
    override fun search(): SearchPinResponse {
        return return http.get(uri(), SearchPinResponse::class.java).body!!
    }

    override fun create(request: CreatePinRequest): CreatePinResponse =
        http.post(uri(), request, CreatePinResponse::class.java).body!!

    override fun delete() =
        http.delete(uri())

    private fun uri(): String =
        "${environment.apiUrl}/v1/users/${session.userId}/pin"
}
