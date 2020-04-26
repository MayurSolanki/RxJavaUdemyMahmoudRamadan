package com.rxjavaudemymahmoudramadan.di.component

import com.rxjavaudemymahmoudramadan.di.AppLogger
import com.rxjavaudemymahmoudramadan.di.module.AppModule
import com.rxjavaudemymahmoudramadan.di.scope.AppScope
import dagger.Component

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 26/04/20, 6:47 PM.
 */

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getAppLogger(): AppLogger
}