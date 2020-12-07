package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.channel.CreateChannelRequest
import com.wutsi.blog.client.channel.CreateChannelResponse
import com.wutsi.blog.client.channel.GetChannelResponse
import com.wutsi.blog.client.channel.SearchChannelResponse
import com.wutsi.blog.client.pin.GetPinResponse
import com.wutsi.blog.sdk.ChannelApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

internal class ChannelApiImpl(
        private val http: Http,
        private val environment: WutsiEnvironment
) : ChannelApi {
    override fun create(request: CreateChannelRequest): CreateChannelResponse =
            http.post(uri(), request, CreateChannelResponse::class.java).body

    override fun delete(id: Long) =
            http.delete(uri("/$id"))

    override fun search(userId: Long): SearchChannelResponse =
            http.get(uri() + "?userId=$userId", SearchChannelResponse::class.java).body

    override fun get(id: Long): GetChannelResponse =
            http.get(uri("/$id"), GetChannelResponse::class.java).body

    private fun uri(path: String = ""): String =
            "${environment.apiUrl}/v1/channels$path"

}
