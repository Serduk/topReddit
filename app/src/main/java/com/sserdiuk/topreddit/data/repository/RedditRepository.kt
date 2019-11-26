package com.sserdiuk.topreddit.data.repository

import com.sserdiuk.topreddit.data.NetworkBoundResource
import com.sserdiuk.topreddit.data.Resource
import com.sserdiuk.topreddit.data.local.dao.PostDao
import com.sserdiuk.topreddit.data.local.entity.PostEntity
import com.sserdiuk.topreddit.data.remote.api.RedditApiService
import com.sserdiuk.topreddit.data.remote.model.Child
import com.sserdiuk.topreddit.data.remote.model.RedditApiResponse
import com.sserdiuk.topreddit.utils.Constants
import io.reactivex.Single
import javax.inject.Singleton

@Singleton
class RedditRepository(
    private val postDao: PostDao,
    private val redditApiService: RedditApiService
) {
    fun loadPosts(): Single<Resource<List<PostEntity>>> {
        return object : NetworkBoundResource<List<PostEntity>, RedditApiResponse>() {

            override fun saveCallResult(item: RedditApiResponse) {
                val posts: MutableList<Child>? = item.data.children

                val localPosts = item.data.children.map {
                    PostEntity(
                        id = it.data.id,
                        author = it.data.author,
                        title = it.data.title,
                        thumbnail = it.data.thumbnail,
                        commentsCount = it.data.numComments,
                        created = it.data.created

                    )
                }

                postDao.insertPosts(localPosts)
            }

            override fun shouldFetch(): Boolean {
                return true
            }

            override fun loadFromDb(): Single<List<PostEntity>> {
                val movieEntities = postDao.getPostsByPage()
                return if (movieEntities == null || movieEntities.isEmpty()) {
                    Single.just(emptyList())
                } else Single.just(movieEntities)
            }

            override fun createCall(): Single<Resource<RedditApiResponse>> {
                return redditApiService.fetchTopWithLimit(Constants.LIMIT)
                    .flatMap { redditApiResponse ->
                        Single.just(
                            if (redditApiResponse == null) Resource.error(
                                ""
                            )
                            else Resource.success(redditApiResponse)
                        )
                    }
            }
        }.getAsSingle()
    }
}