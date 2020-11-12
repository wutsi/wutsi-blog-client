package com.wutsi.blog.client.follow

data class CreateFollowRequest(
        val userId: Long? = null,
        val followerId: Long? = null
)
