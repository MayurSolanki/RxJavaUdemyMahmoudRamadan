package com.rxjavaudemymahmoudramadan

import android.app.Application

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 25/04/20, 10:41 PM.
 */
class RxApp : Application() {


    companion object{
        lateinit var appInstance: RxApp
    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this

    }

}