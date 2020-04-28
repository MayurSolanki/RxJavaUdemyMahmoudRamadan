package com.rxjavaudemymahmoudramadan.di.component

import com.rxjavaudemymahmoudramadan.di.LocalStore
import com.rxjavaudemymahmoudramadan.di.LoginManager
import com.rxjavaudemymahmoudramadan.di.module.HttpServiceModule
import com.rxjavaudemymahmoudramadan.di.module.LocalStoreModule
import com.rxjavaudemymahmoudramadan.di.scope.AppScope
import dagger.Component

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 26/04/20, 11:49 AM.
 */

// Connection between client and service, Client is Mainclass who use service and service is LoginManager
// Scope is the availibility of the object during lifecycle of the activity

@AppScope
@Component(modules = [LocalStoreModule::class,HttpServiceModule::class])
interface LoginComponent {

    fun getLoginManager() : LoginManager

}