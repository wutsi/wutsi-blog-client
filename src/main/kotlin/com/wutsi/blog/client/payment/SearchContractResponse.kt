package com.wutsi.blog.client.payment

data class SearchContractResponse(
    val contracts: List<ContractDto> = emptyList()
)
