package com.rxjavaudemymahmoudramadan.di.module

import com.rxjavaudemymahmoudramadan.di.LocalStore
import dagger.Module
import dagger.Provides

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 26/04/20, 6:25 PM.
 */

@Module
open class LocalStoreModule {

    init {

    }


    @Provides
    fun provideLocalStore() = LocalStore()
}