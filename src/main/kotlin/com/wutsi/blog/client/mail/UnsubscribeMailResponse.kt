package com.wutsi.blog.client.mail

data class UnsubscribeMailResponse(
        val userId: Long? = null,
        val subscriberEmail: String = ""
)
