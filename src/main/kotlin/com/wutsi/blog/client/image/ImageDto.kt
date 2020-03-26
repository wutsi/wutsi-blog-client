
package com.wutsi.blog.client.image

import java.util.Date

data class ImageDto (
        val id: Long? = -1,
        val url: String = "",
        val smallUrl: String? = null,
        val contentType: String? = null,
        val contentLength: Long? = null,
        val width: Int? = null,
        val height: Int? = null,
        val creationDateTime: Date = Date()
)
