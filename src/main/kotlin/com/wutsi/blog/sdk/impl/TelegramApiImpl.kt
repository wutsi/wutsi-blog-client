package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.telegram.CheckBotAccessRequest
import com.wutsi.blog.client.telegram.CheckBotAccessResponse
import com.wutsi.blog.sdk.TelegramApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

internal class TelegramApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : TelegramApi {
    override fun checkAccess(request: CheckBotAccessRequest): CheckBotAccessResponse {
        return http.post(uri("/access"), request, CheckBotAccessResponse::class.java).body
    }

    private fun uri(path: String = ""): String =
        "${environment.apiUrl}/v1/telegram$path"
}
