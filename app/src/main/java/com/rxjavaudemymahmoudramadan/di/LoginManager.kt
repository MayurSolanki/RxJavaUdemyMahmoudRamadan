package com.rxjavaudemymahmoudramadan.di

import javax.inject.Inject

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 26/04/20, 11:19 AM.
 */

// Login Manager depends on ApiService and LocalStore
class LoginManager  @Inject constructor (localStore : LocalStore,httpService:HttpService) {


    fun login( username : String, password :String){


    }

    @Inject
    fun enbleCache(cache: Cache){
          cache.registerCache(this)
    }

}