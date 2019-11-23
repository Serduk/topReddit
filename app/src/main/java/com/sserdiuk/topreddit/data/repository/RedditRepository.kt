package com.sserdiuk.topreddit.data.repository

import com.sserdiuk.topreddit.data.NetworkBoundResource
import com.sserdiuk.topreddit.data.Resource
import com.sserdiuk.topreddit.data.local.dao.PostDao
import com.sserdiuk.topreddit.data.local.entity.PostEntity
import com.sserdiuk.topreddit.data.remote.api.RedditApiService
import com.sserdiuk.topreddit.data.remote.model.RedditApiResponse
import com.sserdiuk.topreddit.utils.Constants
import io.reactivex.Flowable
import io.reactivex.Observable
import javax.inject.Singleton

@Singleton
class RedditRepository(
    private val postDao: PostDao,
    private val redditApiService: RedditApiService
) {
    fun loadPosts() : Observable<Resource<List<PostEntity>>> {
        return object : NetworkBoundResource<List<PostEntity>, RedditApiResponse>() {

            override fun saveCallResult(item: RedditApiResponse) {
                postDao.insertPosts(item.results)
            }

            override fun shouldFetch(): Boolean {
                return true
            }

            override fun loadFromDb(): Flowable<List<PostEntity>> {
                val movieEntities = postDao.getPostsByPage()
                return if (movieEntities == null || movieEntities.isEmpty()) {
                    Flowable.empty()
                } else Flowable.just(movieEntities)
            }

            override fun createCall(): Observable<Resource<RedditApiResponse>> {
                return redditApiService.fetchTopWithLimit(Constants.LIMIT)
                    .flatMap { movieApiResponse ->
                        Observable.just(
                            if (movieApiResponse == null) Resource.error("", RedditApiResponse(1.toString(), emptyList()))
                            else Resource.success(movieApiResponse)
                        )
                    }
            }
        }.getAsObservable()
    }
}