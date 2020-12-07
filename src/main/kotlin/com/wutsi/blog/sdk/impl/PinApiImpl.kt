package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.pin.CreatePinRequest
import com.wutsi.blog.client.pin.CreatePinResponse
import com.wutsi.blog.client.pin.SearchPinResponse
import com.wutsi.blog.sdk.PinApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

class PinApiImpl(
        private val http: Http,
        private val environment: WutsiEnvironment
): PinApi {
    override fun search(userId: Long, limit: Int, offset: Int): SearchPinResponse {
        val path = "?limit=$limit&offset=$offset&userId=$userId"
        return return http.get(uri(path), SearchPinResponse::class.java).body!!
    }

    override fun create(request: CreatePinRequest): CreatePinResponse =
        http.post(uri(), request, CreatePinResponse::class.java).body!!

    override fun delete(id: Long) =
        http.delete(uri("/$id"))

    private fun uri(path: String = ""): String =
        "${environment.apiUrl}/v1/pins$path"
}
