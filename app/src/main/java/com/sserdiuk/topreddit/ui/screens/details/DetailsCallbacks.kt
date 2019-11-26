package com.sserdiuk.topreddit.ui.screens.details

import com.sserdiuk.topreddit.ViewCallback
import com.sserdiuk.topreddit.data.local.entity.PostEntity

interface DetailsCallbacks : ViewCallback {
    fun showData(entity: PostEntity)
    fun onReceiveData(entity: PostEntity)
}