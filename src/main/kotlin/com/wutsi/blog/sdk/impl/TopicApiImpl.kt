package com.wutsi.blog.sdk.impl

import com.wutsi.blog.client.story.SearchTopicResponse
import com.wutsi.blog.sdk.TopicApi
import com.wutsi.blog.sdk.WutsiEnvironment
import com.wutsi.core.http.Http

internal class TopicApiImpl(
        private val http: Http,
        private val environment: WutsiEnvironment
): TopicApi {
    override fun all(): SearchTopicResponse =
        http.get(uri(), SearchTopicResponse::class.java).body!!

    private fun uri(): String =
        "${environment.apiUrl}/v1/topics"
}
