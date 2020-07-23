package com.wutsi.blog.client.payment

import javax.validation.constraints.NotNull

data class SearchEarningRequest(
        @get:NotNull val userId: Long? = null,
        @get:NotNull val year: Int? = null
)
