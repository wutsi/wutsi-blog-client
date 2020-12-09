package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.payment.GetContractResponse
import com.wutsi.blog.sdk.ContractApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

internal class ContractApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : ContractApi {
    override fun get(userId: Long): GetContractResponse =
        http.get(uri(userId), GetContractResponse::class.java).body!!

    private fun uri(userId: Long): String =
        "${environment.apiUrl}/v1/users/$userId/contract"
}
