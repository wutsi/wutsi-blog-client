package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.post.CreatePostRequest
import com.wutsi.blog.client.post.CreatePostResponse
import com.wutsi.blog.client.post.GetPostResponse
import com.wutsi.blog.client.post.SearchPostRequest
import com.wutsi.blog.client.post.SearchPostResponse
import com.wutsi.blog.client.post.UpdatePostRequest
import com.wutsi.blog.client.post.UpdatePostResponse
import com.wutsi.blog.sdk.PostApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http
import java.text.SimpleDateFormat

internal class PostApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : PostApi {
    override fun create(request: CreatePostRequest): CreatePostResponse =
        http.post(uri(), request, CreatePostResponse::class.java).body

    override fun update(postId: Long, request: UpdatePostRequest): UpdatePostResponse =
        http.post(uri("/$postId"), request, UpdatePostResponse::class.java).body

    override fun get(postId: Long): GetPostResponse =
        http.get(uri("/$postId"), GetPostResponse::class.java).body

    override fun search(request: SearchPostRequest): SearchPostResponse {
        val url = uri() + "?" + params(request, true)
        return http.get(url, SearchPostResponse::class.java).body
    }

    override fun delete(id: Long) =
        http.delete(uri("/$id"))

    private fun params(request: SearchPostRequest, includeLimitOffset: Boolean): String {
        val fmt = SimpleDateFormat("yyyy-MM-dd")
        val buff = mutableListOf<String>()
        request.status?.let { buff.add("status=${it.name}") }
        request.storyId?.let { buff.add("storyId=$it") }
        request.scheduledPostStartDateTime.let { buff.add("scheduledPostStartDateTime=" + fmt.format(it)) }
        request.scheduledPostEndDateTime.let { buff.add("scheduledPostEndDateTime=" + fmt.format(it)) }

        if (includeLimitOffset) {
            buff.add("limit=${request.limit}")
            buff.add("offset=${request.offset}")
        }

        return buff.joinToString(separator = "&")
    }

    private fun uri(path: String = ""): String =
        "${environment.apiUrl}/v1/posts$path"
}
