package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.story.SearchTagResponse
import com.wutsi.blog.sdk.TagApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http
import java.net.URLEncoder

internal class TagApiImpl(
    private val http: Http,
    private val environment: WutsiEnvironment
) : TagApi {
    override fun search(query: String): SearchTagResponse {
        val url = uri() + "?query=" + URLEncoder.encode(query, "utf-8")
        return http.get(url, SearchTagResponse::class.java).body!!
    }

    private fun uri(): String =
        "${environment.apiUrl}/v1/tags"
}
