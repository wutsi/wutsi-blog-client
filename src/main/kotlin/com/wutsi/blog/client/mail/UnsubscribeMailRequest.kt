package com.wutsi.blog.client.mail

import javax.validation.constraints.NotBlank

@Deprecated("use UnsubscribeNewsletterRequest")
data class UnsubscribeMailRequest(
        val userId: Long? = null,
        @get:NotBlank val subscriberEmail: String = ""
)
