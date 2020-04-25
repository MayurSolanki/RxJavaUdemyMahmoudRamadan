package com.rxjavaudemymahmoudramadan

import com.rxjavaudemymahmoudramadan.db.Repo
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 11:59 AM.
 */
interface GithubService {

    @GET("users/{user}/starred")
    fun getStarredRepo(@Path("user") user : String) : Observable<List<Repo>>



}