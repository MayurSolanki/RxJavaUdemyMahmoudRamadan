package com.rxjavaudemymahmoudramadan.repository

import com.rxjavaudemymahmoudramadan.RxApp
import com.rxjavaudemymahmoudramadan.db.AppDatabase
import com.rxjavaudemymahmoudramadan.db.Repo
import io.reactivex.Observable

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 9:58 PM.
 */
object RepoLocalSource : RepoDataSource {
    override fun fetchRepos(username: String): Observable<List<Repo>> {

        return Observable.fromCallable{
             AppDatabase.getDatabaseInstance(RxApp.appInstance)?.getRepoDao()!!.fetchAllMyStarredRepos()
        }


    }

    override fun saveRepos(repoList: List<Repo>) {
         AppDatabase.getDatabaseInstance(RxApp.appInstance)?.getRepoDao()!!.saveAllMyStarredRepos(repoList)

    }
}