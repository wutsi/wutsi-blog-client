package com.wutsi.blog.client.error

data class ErrorDto (
        val code:String? = null,
        val message:String? = null,
        val exception:String? = null,
        val stackTrace:List<String>? = null
)
