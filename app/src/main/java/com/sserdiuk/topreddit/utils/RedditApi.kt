package com.sserdiuk.topreddit.utils

import com.sserdiuk.topreddit.data.PostModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RedditApi {
    /**
     * Fetch TOP posts with limit
     * */
    @GET("r/politics/top.json?limit={limit}")
    fun getTopWithLimit(@Path("limit") limit: String) : Call<List<PostModel>>
}