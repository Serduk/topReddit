package com.sserdiuk.topreddit.data.remote.model

data class RedditApiResponse(
    val page: String,
    val results: List<PostModel>
)