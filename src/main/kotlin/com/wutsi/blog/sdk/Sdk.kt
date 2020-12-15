package com.wutsi.blog.sdk

import com.wutsi.blog.sdk.impl.ChannelApiImpl
import com.wutsi.blog.sdk.impl.CommentApiImpl
import com.wutsi.blog.sdk.impl.ContractApiImpl
import com.wutsi.blog.sdk.impl.FollowerApiImpl
import com.wutsi.blog.sdk.impl.LikeApiImpl
import com.wutsi.blog.sdk.impl.NewsletterApiImpl
import com.wutsi.blog.sdk.impl.PartnerApiImpl
import com.wutsi.blog.sdk.impl.PinApiImpl
import com.wutsi.blog.sdk.impl.ShareApiImpl
import com.wutsi.blog.sdk.impl.TagApiImpl
import com.wutsi.blog.sdk.impl.TopicApiImpl
import com.wutsi.blog.sdk.impl.UserApiImpl
import com.wutsi.core.http.Http

class Sdk(
    private val http: Http,
    private val environment: WutsiEnvironment
) {
    fun channelApi(): ChannelApi = ChannelApiImpl(http, environment)

    fun commentApi(): CommentApi = CommentApiImpl(http, environment)

    fun contractApi(): ContractApi = ContractApiImpl(http, environment)

    fun followerApi(): FollowerApi = FollowerApiImpl(http, environment)

    fun likeApi(): LikeApi = LikeApiImpl(http, environment)

    fun newsletterApi(): NewsletterApi = NewsletterApiImpl(http, environment)

    fun partnerApi(): PartnerApi = PartnerApiImpl(http, environment)

    fun pinApi(): PinApi = PinApiImpl(http, environment)

    fun shareApi(): ShareApi = ShareApiImpl(http, environment)

    fun tagApi(): TagApi = TagApiImpl(http, environment)

    fun topicApi(): TopicApi = TopicApiImpl(http, environment)

    fun userApi(): UserApi = UserApiImpl(http, environment)
}
