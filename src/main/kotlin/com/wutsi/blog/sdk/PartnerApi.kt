package com.wutsi.blog.sdk

import com.wutsi.blog.client.payment.GetPartnerResponse
import com.wutsi.blog.client.payment.SavePartnerRequest
import com.wutsi.blog.client.payment.SavePartnerResponse

interface PartnerApi {
    fun get(userId: Long): GetPartnerResponse
    fun save(userId: Long, request: SavePartnerRequest): SavePartnerResponse
}
