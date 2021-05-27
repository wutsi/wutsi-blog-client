package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.user.CountUserResponse
import com.wutsi.blog.client.user.GetUserResponse
import com.wutsi.blog.client.user.SaveWalletRequest
import com.wutsi.blog.client.user.SaveWalletResponse
import com.wutsi.blog.client.user.SearchUserRequest
import com.wutsi.blog.client.user.SearchUserResponse
import com.wutsi.blog.client.user.UpdateUserAttributeRequest
import com.wutsi.blog.client.user.UpdateUserAttributeResponse
import com.wutsi.blog.sdk.UserApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

internal class UserApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : UserApi {
    override fun get(userId: Long): GetUserResponse =
        http.get(uri("/$userId"), GetUserResponse::class.java).body

    override fun get(username: String): GetUserResponse =
        http.get(uri("/@/$username"), GetUserResponse::class.java).body

    override fun set(userId: Long, request: UpdateUserAttributeRequest): UpdateUserAttributeResponse =
        http.post(uri("/$userId/attributes"), request, UpdateUserAttributeResponse::class.java).body

    override fun wallet(userId: Long, request: SaveWalletRequest): SaveWalletResponse =
        http.post(uri("/$userId/wallet"), request, SaveWalletResponse::class.java).body

    override fun search(request: SearchUserRequest): SearchUserResponse {
        val url = uri() + "?" + params(request, true)
        return http.get(url, SearchUserResponse::class.java).body
    }

    override fun count(request: SearchUserRequest): CountUserResponse {
        val url = uri("/count") + "?" + params(request, false)
        return http.get(url, CountUserResponse::class.java).body
    }

    private fun params(request: SearchUserRequest, includeLimitOffset: Boolean): String {
        val buff = mutableListOf<String>()
        request.autoFollowedByBlogs?.let { buff.add("autoFollowedByBlogs=$it") }
        request.blog?.let { buff.add("blog=$it") }
        buff.add("sortBy=${request.sortBy.name}")
        buff.add("sortOrder=${request.sortOrder.name}")

        request.userIds.forEach {
            buff.add("userId=$it")
        }

        if (includeLimitOffset) {
            buff.add("limit=${request.limit}")
            buff.add("offset=${request.offset}")
        }

        return buff.joinToString(separator = "&")
    }

    private fun uri(path: String = ""): String =
        "${environment.apiUrl}/v1/users$path"
}
