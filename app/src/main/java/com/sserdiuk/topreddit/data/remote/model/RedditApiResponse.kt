package com.sserdiuk.topreddit.data.remote.model

import com.sserdiuk.topreddit.data.local.entity.PostEntity

data class RedditApiResponse(
    val page: String,
    val results: List<PostEntity>
)