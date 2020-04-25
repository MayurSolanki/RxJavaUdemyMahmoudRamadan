package com.rxjavaudemymahmoudramadan.repository

import com.rxjavaudemymahmoudramadan.db.Repo
import io.reactivex.Observable
import io.reactivex.ObservableSource

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 9:55 PM.
 */
class RepoRepository(val repoRemoteSource : RepoRemoteSource,val repoLocalSource : RepoLocalSource) :RepoDataSource {
    override fun fetchRepos(username: String): Observable<List<Repo>> {
        return Observable.concat(repoRemoteSource.fetchRepos(username), repoLocalSource.fetchRepos(username))
            .doOnNext {
                saveRepos(it)
            }.onErrorResumeNext(
                Observable.empty())
    }

    override fun saveRepos(repoList: List<Repo>) {
            repoLocalSource.saveRepos(repoList)

    }
}