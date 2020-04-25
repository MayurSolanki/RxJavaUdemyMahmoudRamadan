package com.rxjavaudemymahmoudramadan.repository

import com.rxjavaudemymahmoudramadan.db.Repo
import io.reactivex.Observable

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 10:00 PM.
 */
interface RepoDataSource {
    fun fetchRepos(username:String):Observable<List<Repo>>
    fun saveRepos(repoList:List<Repo>)

}