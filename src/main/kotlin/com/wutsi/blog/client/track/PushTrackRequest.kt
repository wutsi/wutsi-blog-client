package com.wutsi.blog.client.track

import javax.validation.constraints.NotNull

data class PushTrackRequest(
        val time: Long = System.currentTimeMillis(),
        @get:NotNull val duid: String? = null,
        val uid: String? = null,
        val hid: String? = null,
        val ua: String? = null,
        val ip: String? = null,
        val lat: Double? = null,
        val long: Double? = null,
        val referer: String? = null,
        val page: String? = null,
        @get:NotNull val event: String? = null,
        val pid: String? = null,
        val value: String? = null
)
