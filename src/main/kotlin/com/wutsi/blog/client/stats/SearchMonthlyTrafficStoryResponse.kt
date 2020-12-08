package com.wutsi.blog.client.stats

data class SearchMonthlyTrafficStoryResponse(
    val traffics: List<MonthlyTrafficStoryDto> = emptyList()
)
