package com.wutsi.blog.sdk

import com.wutsi.blog.sdk.impl.NewsletterApiImpl
import com.wutsi.blog.sdk.impl.PinApiImpl
import com.wutsi.blog.sdk.impl.TagApiImpl
import com.wutsi.blog.sdk.impl.TopicApiImpl
import com.wutsi.core.http.Http

class Sdk(
        private val http: Http,
        private val environment: WutsiEnvironment
){
    fun newsletterApi(): NewsletterApi =
            NewsletterApiImpl(http, environment)

    fun pinApi (): PinApi =
            PinApiImpl(http, environment)

    fun tagApi (): TagApi =
            TagApiImpl(http, environment)

    fun topicApi (): TopicApi =
            TopicApiImpl(http, environment)
}

