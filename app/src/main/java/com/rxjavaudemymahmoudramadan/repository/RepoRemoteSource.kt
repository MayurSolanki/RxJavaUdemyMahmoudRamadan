package com.rxjavaudemymahmoudramadan.repository

import com.rxjavaudemymahmoudramadan.GithubApiClient
import com.rxjavaudemymahmoudramadan.db.Repo
import io.reactivex.Observable

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 9:58 PM.
 */
object RepoRemoteSource:RepoDataSource {

    override fun fetchRepos(username: String): Observable<List<Repo>> {
        return  GithubApiClient.getGithubApiService().getStarredRepo(username)


    }

    override fun saveRepos(repoList: List<Repo>) {

    }
}