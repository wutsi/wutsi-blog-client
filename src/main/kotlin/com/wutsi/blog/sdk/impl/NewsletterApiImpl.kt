package com.wutsi.blog.sdk.impl

import com.wutsi.blog.sdk.NewsletterApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http
import java.net.URLEncoder

internal class NewsletterApiImpl(
        private val http: Http,
        private val environment: WutsiEnvironment
): NewsletterApi {
    override fun unsubscribe(email: String) {
        unsubscribe(uri(), email)
    }

    override fun unsubscribe(userId: Long, email: String) {
        unsubscribe(uri("/$userId"), email)
    }

    private fun unsubscribe(uri: String, email: String) {
        http.delete("$uri?email=" + URLEncoder.encode(email, "utf-8"))
    }

    private fun uri(path: String = ""): String =
        "${environment.apiUrl}/v1/newsletters$path"
}
