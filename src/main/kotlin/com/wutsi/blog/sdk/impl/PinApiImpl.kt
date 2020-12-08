package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.pin.CreatePinRequest
import com.wutsi.blog.client.pin.CreatePinResponse
import com.wutsi.blog.client.pin.GetPinResponse
import com.wutsi.blog.sdk.PinApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

internal class PinApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : PinApi {
    override fun get(userId: Long): GetPinResponse {
        return return http.get(uri(userId), GetPinResponse::class.java).body!!
    }

    override fun create(userId: Long, request: CreatePinRequest): CreatePinResponse =
        http.post(uri(userId), request, CreatePinResponse::class.java).body!!

    override fun delete(userId: Long) =
        http.delete(uri(userId))

    private fun uri(userId: Long): String =
        "${environment.apiUrl}/v1/users/$userId/pin"
}
