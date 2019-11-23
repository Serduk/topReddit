package com.sserdiuk.topreddit.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sserdiuk.topreddit.data.local.entity.PostEntity

@Dao
interface PostDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPosts(posts: List<PostEntity>): LongArray

    @Query("SELECT * FROM PostEntity")
    fun getPostsByPage(): List<PostEntity>
}