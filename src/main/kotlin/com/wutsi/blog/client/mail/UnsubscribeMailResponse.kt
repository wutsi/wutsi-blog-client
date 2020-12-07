package com.wutsi.blog.client.mail

@Deprecated("")
data class UnsubscribeMailResponse(
        val userId: Long? = null,
        val subscriberEmail: String = ""
)
