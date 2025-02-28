package com.rxjavaudemymahmoudramadan

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 12:05 PM.
 */
object GithubApiClient {

    val  BASE_URL = "https://api.github.com"
    var githubService : GithubService

    init {
        val loggingInterceptor : HttpLoggingInterceptor =  HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY


        val okHttpClient = OkHttpClient.Builder().addInterceptor(loggingInterceptor)
            .readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS)
            .build()

        val retrofit   = Retrofit.Builder().baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        githubService = retrofit.create(GithubService::class.java)

    }

    fun getGithubApiService() : GithubService {
        return githubService
    }

}