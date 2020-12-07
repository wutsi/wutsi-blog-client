package com.wutsi.blog.sdk

import com.wutsi.blog.sdk.impl.PinApiImpl
import com.wutsi.core.http.Http

class Sdk(
        private val http: Http,
        private val environment: WutsiEnvironment
){
    fun pinApi (): PinApi =
            PinApiImpl(http, environment)
}

