package com.sserdiuk.topreddit.di.module

import android.app.Application
import androidx.room.Room
import com.sserdiuk.topreddit.data.local.AppDatabase
import com.sserdiuk.topreddit.data.local.dao.PostDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {

    /*
     * The method returns the Database object
     * */
    @Provides
    @Singleton
    internal fun provideDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(
            application, AppDatabase::class.java, "Entertainment.db")
            .allowMainThreadQueries().build()
    }


    /*
     * We need the PostDao module.
     * For this, We need the AppDatabase object
     * So we will define the providers for this here in this module.
     * */
    @Provides
    @Singleton
    internal fun providePostDao(appDatabase: AppDatabase): PostDao {
        return appDatabase.postDao()
    }
}
