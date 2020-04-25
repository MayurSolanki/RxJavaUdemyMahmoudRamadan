package com.rxjavaudemymahmoudramadan.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 11:08 AM.
 */

@Entity(tableName = "repo_table")
data class Repo(
    @PrimaryKey
    @ColumnInfo(name = "id")
    @SerializedName("id") val id:String,
    @ColumnInfo(name = "name")
    @SerializedName("name") val name:String,
    @ColumnInfo(name = "description")
    @SerializedName("description") val desc: String? = null,
    @ColumnInfo(name = "language")
    @SerializedName("language") val lang:String?,
    @ColumnInfo(name = "stargazers_count")
    @SerializedName("stargazers_count") val count:Int
)
