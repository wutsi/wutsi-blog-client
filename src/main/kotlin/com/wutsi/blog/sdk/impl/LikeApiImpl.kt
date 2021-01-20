package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.like.CountLikeResponse
import com.wutsi.blog.client.like.CreateLikeRequest
import com.wutsi.blog.client.like.CreateLikeResponse
import com.wutsi.blog.client.like.SearchLikeRequest
import com.wutsi.blog.client.like.SearchLikeResponse
import com.wutsi.blog.sdk.LikeApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http
import java.text.SimpleDateFormat

internal class LikeApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : LikeApi {
    override fun create(request: CreateLikeRequest): CreateLikeResponse =
        http.post(uri(), request, CreateLikeResponse::class.java).body

    override fun search(request: SearchLikeRequest): SearchLikeResponse {
        val url = uri() + "?" + params(request, true)
        return http.get(url, SearchLikeResponse::class.java).body
    }

    override fun count(request: SearchLikeRequest): CountLikeResponse {
        val url = uri("/count") + "?" + params(request, false)
        return http.get(url, CountLikeResponse::class.java).body
    }

    override fun delete(id: Long) =
        http.delete(uri("/$id"))

    private fun params(request: SearchLikeRequest, includeLimitOffset: Boolean): String {
        val fmt = SimpleDateFormat("yyyy-MM-dd")
        val buff = mutableListOf<String>()
        request.userId?.let { buff.add("userId=$it") }
        request.deviceId?.let { buff.add("deviceId=$it") }
        request.authorId?.let { buff.add("authorId=$it") }
        request.since?.let { buff.add("since=" + fmt.format(it)) }

        request.storyIds.forEach {
            buff.add("storyId=$it")
        }

        if (includeLimitOffset) {
            buff.add("limit=${request.limit}")
            buff.add("offset=${request.offset}")
        }

        return buff.joinToString(separator = "&")
    }

    private fun uri(path: String = ""): String =
        "${environment.apiUrl}/v1/likes$path"
}
