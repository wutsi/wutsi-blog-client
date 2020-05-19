package com.wutsi.blog.client.wpp

import javax.validation.constraints.NotNull

data class SavePartnerRequest(
        @get:NotNull val fullName: String? = null,
        @get:NotNull val countryCode: String? = null,
        @get:NotNull val mobileNumber: String? = null,
        @get:NotNull val mobileProvider: MobileProvider? = null
)
