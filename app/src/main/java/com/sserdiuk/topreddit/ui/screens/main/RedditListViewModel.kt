package com.sserdiuk.topreddit.ui.screens.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sserdiuk.topreddit.data.Resource
import com.sserdiuk.topreddit.data.local.dao.PostDao
import com.sserdiuk.topreddit.data.local.entity.PostEntity
import com.sserdiuk.topreddit.data.remote.api.RedditApiService
import com.sserdiuk.topreddit.data.repository.RedditRepository
import javax.inject.Inject

class RedditListViewModel @Inject constructor(
    postsDao: PostDao,
    redditApiService: RedditApiService
) : ViewModel() {

    /* You can see we are initialising the MovieRepository class here */
    private val movieRepository: RedditRepository = RedditRepository(postsDao, redditApiService)

    /* We are using LiveData to update the UI with the data changes.
     */
    private val moviesListLiveData = MutableLiveData<Resource<List<PostEntity>>>()

    /*
     * Method called by UI to fetch movies list
     * */
    fun loadMoreMovies() {
        movieRepository.loadPosts()
            .subscribe { resource -> getMoviesLiveData().postValue(resource) }
    }

    /*
     * LiveData observed by the UI
     * */
    fun getMoviesLiveData() = moviesListLiveData
}