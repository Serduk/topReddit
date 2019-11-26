package com.sserdiuk.topreddit.ui.screens.main

import com.sserdiuk.topreddit.ViewCallback
import com.sserdiuk.topreddit.data.local.entity.PostEntity

interface MainCallbacks : ViewCallback {
    fun showError()
    fun showResult()
    fun setItems(results: List<PostEntity>)
}