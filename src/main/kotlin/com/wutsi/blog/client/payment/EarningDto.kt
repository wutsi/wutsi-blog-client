package com.wutsi.blog.client.payment

data class EarningDto(
    val id: Long = -1,
    val userId: Long = -1,
    val contractId: Long? = null,
    val partnerId: Long? = null,
    val month: Int = 0,
    val year: Int = 0,
    val amount: Long = 0,
    val currency: String = ""
)
