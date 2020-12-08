package com.wutsi.blog.client.wpp

import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class SavePartnerRequest(
    @get:NotBlank val fullName: String? = null,
    @get:NotBlank val countryCode: String? = null,
    @get:NotBlank val mobileNumber: String? = null,
    @get:NotNull val mobileProvider: MobileProvider? = null,
    @get:Email @get:NotBlank val email: String? = null
)
