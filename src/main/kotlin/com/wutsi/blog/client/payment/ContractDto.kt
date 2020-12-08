package com.wutsi.blog.client.payment

import java.math.BigDecimal
import java.util.Date

data class ContractDto(
    val id: Long = -1,
    val userId: Long = -1,
    val amount: BigDecimal = BigDecimal.ZERO,
    val currency: String = "",
    val startDate: Date = Date(),
    val endDate: Date? = null,
    val creationDateTime: Date = Date(),
    val modificationDateTime: Date = Date()
)
