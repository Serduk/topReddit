package com.sserdiuk.topreddit.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sserdiuk.topreddit.di.ViewModelKey
import com.sserdiuk.topreddit.factory.ViewModelFactory
import com.sserdiuk.topreddit.ui.screens.main.RedditListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory


    /*
     * This method basically says
     * inject this object into a Map using the @IntoMap annotation,
     * with the  MovieListViewModel.class as key,
     * and a Provider that will build a MovieListViewModel
     * object.
     *
     * */

    @Binds
    @IntoMap
    @ViewModelKey(RedditListViewModel::class)
    protected abstract fun postListViewModel(moviesListViewModel: RedditListViewModel): ViewModel
}