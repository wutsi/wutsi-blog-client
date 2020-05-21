package com.wutsi.blog.client.wpp

import java.util.Date

data class PartnerDto(
        val id: Long = -1,
        val userId: Long = -1,
        val countryCode: String = "",
        val fullName: String = "",
        val email: String = "",
        val mobileNumber: String = "",
        val mobileProvider: MobileProvider = MobileProvider.mtn,
        val creationDateTime: Date = Date(),
        val modificationDateTime: Date = Date()
)
