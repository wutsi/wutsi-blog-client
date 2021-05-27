package com.wutsi.blog.client.user

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

public data class SaveWalletRequest(
    @get:NotNull
    public val type: WalletType? = null,

    @get:NotBlank
    public val mobileNumber: String = "",

    @get:NotNull
    public val mobileProvider: MobileProvider? = null,

    @get:NotBlank
    public val country: String = "",

    @get:NotBlank
    public val fullName: String = ""
)
