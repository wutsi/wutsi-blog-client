package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.follower.CountFollowerResponse
import com.wutsi.blog.client.follower.CreateFollowerRequest
import com.wutsi.blog.client.follower.CreateFollowerResponse
import com.wutsi.blog.client.follower.SearchFollowerRequest
import com.wutsi.blog.client.follower.SearchFollowerResponse
import com.wutsi.blog.sdk.FollowerApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

internal class FollowerApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : FollowerApi {
    override fun create(request: CreateFollowerRequest): CreateFollowerResponse =
        http.post(uri(), request, CreateFollowerResponse::class.java).body

    override fun search(request: SearchFollowerRequest): SearchFollowerResponse {
        val url = uri() + "?" + params(request, true)
        return http.get(url, SearchFollowerResponse::class.java).body
    }

    override fun count(request: SearchFollowerRequest): CountFollowerResponse {
        val url = uri("/count") + "?" + params(request, false)
        return http.get(url, CountFollowerResponse::class.java).body
    }

    override fun delete(id: Long) =
        http.delete(uri("/$id"))

    private fun params(request: SearchFollowerRequest, includeLimitOffset: Boolean): String {
        val buff = mutableListOf<String>()
        request.userId?.let { buff.add("userId=$it") }
        request.followerUserId?.let { buff.add("followerUserId=$it") }

        if (includeLimitOffset) {
            buff.add("limit=${request.limit}")
            buff.add("offset=${request.offset}")
        }

        return buff.joinToString(separator = "&")
    }

    private fun uri(path: String = ""): String =
        "${environment.apiUrl}/v1/followers$path"
}
