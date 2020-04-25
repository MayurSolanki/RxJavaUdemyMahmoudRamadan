package com.rxjavaudemymahmoudramadan.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 10:38 PM.
 */
@Database(entities = arrayOf(Repo::class), version = 1)
abstract class AppDatabase  : RoomDatabase(){

    abstract fun  getRepoDao() : RepoDAO

    companion object{
        var INSTANCE : AppDatabase? = null

        fun getDatabaseInstance( context: Context):AppDatabase?{
             INSTANCE?.let {
                 INSTANCE
             }?: run {
                 INSTANCE = Room.databaseBuilder(context, AppDatabase::class.java, "repo.db").build()
             }

            return INSTANCE
        }
    }

}