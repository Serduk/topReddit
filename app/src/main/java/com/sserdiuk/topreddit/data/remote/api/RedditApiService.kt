package com.sserdiuk.topreddit.data.remote.api

import com.sserdiuk.topreddit.data.remote.model.RedditApiResponse
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface RedditApiService {
    /**
     * Fetch TOP posts with limit
     * */
    @GET("top.json?limit={limit}")
    fun fetchTopWithLimit(@Path("limit") limit: String): Single<RedditApiResponse>
}