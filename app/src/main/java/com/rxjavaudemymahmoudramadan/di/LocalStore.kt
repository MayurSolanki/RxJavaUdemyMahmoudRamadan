package com.rxjavaudemymahmoudramadan.di

import javax.inject.Inject

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 26/04/20, 11:18 AM.
 */
class LocalStore  @Inject constructor(){

    @Inject
    fun localInjection(str : String) : String{

        return str
    }

}