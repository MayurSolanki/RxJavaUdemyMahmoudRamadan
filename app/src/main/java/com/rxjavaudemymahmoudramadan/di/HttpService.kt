package com.rxjavaudemymahmoudramadan.di

import javax.inject.Inject

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 26/04/20, 6:31 PM.
 */
class HttpService @Inject constructor() {

    @Inject
    fun HttpInjection(str : String) : String{

        return str
    }
//    @Inject
//    fun startService() {
//
//    }


}