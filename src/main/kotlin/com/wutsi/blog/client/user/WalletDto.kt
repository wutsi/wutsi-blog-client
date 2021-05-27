package com.wutsi.blog.client.user

import com.wutsi.blog.client.user.WalletType.INVALID

public data class WalletDto(
    public val type: WalletType = INVALID,
    public val mobileNumber: String = "",
    public val mobileProvider: MobileProvider = MobileProvider.INVALID,
    public val country: String = "",
    public val fullName: String = ""
)
