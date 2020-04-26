package com.rxjavaudemymahmoudramadan

import android.app.Application
import android.util.Log
import com.rxjavaudemymahmoudramadan.di.component.DaggerAppComponent
import com.rxjavaudemymahmoudramadan.di.component.DaggerLoginComponent
import com.rxjavaudemymahmoudramadan.di.module.AppModule

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

        val appComponent = DaggerAppComponent.builder().appModule(AppModule()).build()

        Log.d(" DAGGEERR ",appComponent.getAppLogger().value)
        Log.d(" DAGGEERR ",appComponent.getAppLogger().value)
        Log.d(" DAGGEERR ",appComponent.getAppLogger().value)


    }

}