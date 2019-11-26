package com.sserdiuk.topreddit.data.remote.model

import com.google.gson.annotations.SerializedName

data class RedditApiResponse(
    @SerializedName("data")
    val data: Data
)