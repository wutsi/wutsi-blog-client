package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.payment.GetPartnerResponse
import com.wutsi.blog.client.payment.SavePartnerRequest
import com.wutsi.blog.client.payment.SavePartnerResponse
import com.wutsi.blog.sdk.PartnerApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

internal class PartnerApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : PartnerApi {
    override fun save(userId: Long, request: SavePartnerRequest): SavePartnerResponse =
        http.post(uri(userId), request, SavePartnerResponse::class.java).body

    override fun get(userId: Long): GetPartnerResponse =
        http.get(uri(userId), GetPartnerResponse::class.java).body

    private fun uri(userId: Long): String =
        "${environment.apiUrl}/v1/users/$userId/partner"
}
