package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.comment.CountCommentResponse
import com.wutsi.blog.client.comment.CreateCommentRequest
import com.wutsi.blog.client.comment.CreateCommentResponse
import com.wutsi.blog.client.comment.SearchCommentRequest
import com.wutsi.blog.client.comment.SearchCommentResponse
import com.wutsi.blog.sdk.CommentApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http
import java.text.SimpleDateFormat

internal class CommentApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : CommentApi {
    override fun create(request: CreateCommentRequest): CreateCommentResponse =
        http.post(uri(), request, CreateCommentResponse::class.java).body

    override fun search(request: SearchCommentRequest): SearchCommentResponse {
        val url = uri() + "?" + params(request, true)
        return http.get(url, SearchCommentResponse::class.java).body
    }

    override fun count(request: SearchCommentRequest): CountCommentResponse {
        val url = uri("/count") + "?" + params(request, false)
        return http.get(url, CountCommentResponse::class.java).body
    }

    override fun delete(id: Long) =
        http.delete(uri("/$id"))

    private fun params(request: SearchCommentRequest, includeLimitOffset: Boolean): String {
        val fmt = SimpleDateFormat("yyyy-MM-dd")
        val buff = mutableListOf<String>()
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
        "${environment.apiUrl}/v1/comments$path"
}
