package com.wutsi.blog.client.mail

import javax.validation.constraints.NotBlank

data class UnsubscribeMailRequest(
        @get:NotBlank val email: String = ""
)
