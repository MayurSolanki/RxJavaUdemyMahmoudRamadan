package com.rxjavaudemymahmoudramadan.di.module

import com.rxjavaudemymahmoudramadan.di.AppLogger
import com.rxjavaudemymahmoudramadan.di.scope.AppScope
import dagger.Module
import dagger.Provides

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 26/04/20, 6:47 PM.
 */

@Module
class AppModule {

    private var index = 0

    @Provides
    @AppScope
    fun provideAppLogger() :AppLogger{
        index++
        return AppLogger("App Logger Index: $index")

    }

}