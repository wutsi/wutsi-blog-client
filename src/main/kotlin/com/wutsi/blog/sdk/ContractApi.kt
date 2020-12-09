package com.wutsi.blog.sdk

import com.wutsi.blog.client.payment.GetContractResponse

interface ContractApi {
    fun get(userId: Long): GetContractResponse
}
