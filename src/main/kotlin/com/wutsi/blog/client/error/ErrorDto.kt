package com.wutsi.blog.client.error

data class ErrorDto (
        val code:String = "",
        val message:String = "",
        val exception:String? = null,
        val stackTrace:List<String>? = null
)
