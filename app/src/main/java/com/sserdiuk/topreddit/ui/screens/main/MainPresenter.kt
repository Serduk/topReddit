package com.sserdiuk.topreddit.ui.screens.main

import com.sserdiuk.topreddit.Presenter
import com.sserdiuk.topreddit.data.local.entity.PostEntity
import com.sserdiuk.topreddit.data.repository.RedditRepository

class MainPresenter(private val redditRepository: RedditRepository) : Presenter<MainCallbacks, MainRouter>() {
    private var results: List<PostEntity>? = null
    override fun onTakeView() {
        super.onTakeView()
//        redditRepository.loadPosts().subscribe({view?.setItems(it)}, {})
        redditRepository.loadPosts().subscribe({results = it.data}, {})
        if (results.isNullOrEmpty()) view?.showError()
        else view?.setItems(results!!)
    }

    fun onItemClicked(position: Int) {
        router?.openPost(results!![position])
    }
}