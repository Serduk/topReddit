package com.sserdiuk.topreddit.di.component

import android.app.Application
import com.sserdiuk.topreddit.di.module.*
import com.sserdiuk.topreddit.di.module.ViewModelModule
import com.sserdiuk.topreddit.ui.AppController
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [
        ApiModule::class,
        DbModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        AndroidSupportInjectionModule::class,
        ApplicationModule::class]
)
@Singleton
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(appController: AppController)
}