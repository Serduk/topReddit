package com.sserdiuk.topreddit.ui.screens.main

import com.sserdiuk.topreddit.Router
import com.sserdiuk.topreddit.data.local.entity.PostEntity

interface MainRouter : Router {
    fun openPost(postEntity: PostEntity)
}