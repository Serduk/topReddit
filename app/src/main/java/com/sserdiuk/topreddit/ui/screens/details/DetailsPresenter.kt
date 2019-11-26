package com.sserdiuk.topreddit.ui.screens.details

import com.sserdiuk.topreddit.Presenter
import com.sserdiuk.topreddit.data.local.entity.PostEntity

class DetailsPresenter : Presenter<DetailsCallbacks, DetailsRouter>() {
    override fun onTakeView() {
        super.onTakeView()

    }

    fun onTakeData(item: PostEntity) {
        view?.showData(item)
    }
}