package com.wutsi.blog.sdk

import com.wutsi.blog.client.post.CreatePostRequest
import com.wutsi.blog.client.post.CreatePostResponse
import com.wutsi.blog.client.post.GetPostResponse
import com.wutsi.blog.client.post.SearchPostRequest
import com.wutsi.blog.client.post.SearchPostResponse
import com.wutsi.blog.client.post.UpdatePostRequest
import com.wutsi.blog.client.post.UpdatePostResponse

interface PostApi {
    fun create(request: CreatePostRequest): CreatePostResponse
    fun update(postId: Long, request: UpdatePostRequest): UpdatePostResponse
    fun get(postId: Long): GetPostResponse
    fun search(request: SearchPostRequest): SearchPostResponse
    fun delete(postId: Long)
}
