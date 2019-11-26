package com.sserdiuk.topreddit.di.module

import com.sserdiuk.topreddit.data.local.dao.PostDao
import com.sserdiuk.topreddit.data.remote.api.RedditApiService
import com.sserdiuk.topreddit.data.repository.RedditRepository
import com.sserdiuk.topreddit.ui.screens.details.DetailsPresenter
import com.sserdiuk.topreddit.ui.screens.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {
    @Provides
    internal fun provideMainPresenter(redditRepository: RedditRepository): MainPresenter {
        return MainPresenter(redditRepository)
    }

    @Provides
    internal fun redditRepository(
        postDao: PostDao,
        redditApiService: RedditApiService
    ): RedditRepository {
        return RedditRepository(postDao, redditApiService)
    }

    @Provides
    internal fun provideDetailsPresenter(): DetailsPresenter {
        return DetailsPresenter()
    }
}