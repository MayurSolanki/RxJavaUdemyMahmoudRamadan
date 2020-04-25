package com.rxjavaudemymahmoudramadan.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Observable

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 10:34 PM.
 */

@Dao
interface RepoDAO {
    @Query("select * FROM repo_table")
    fun fetchAllMyStarredRepos() : List<Repo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveAllMyStarredRepos(list: List<Repo>)
}