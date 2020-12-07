package com.wutsi.blog.sdk

import com.wutsi.blog.client.pin.CreatePinRequest
import com.wutsi.blog.client.pin.CreatePinResponse
import com.wutsi.blog.client.pin.SearchPinResponse

interface PinApi {
    fun search(limit: Int = 20, offset: Int = 0): SearchPinResponse
    fun create(request: CreatePinRequest): CreatePinResponse
    fun delete()
}
