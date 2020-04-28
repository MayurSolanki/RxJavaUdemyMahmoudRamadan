package com.rxjavaudemymahmoudramadan.di.module

import com.rxjavaudemymahmoudramadan.di.ApiService
import com.rxjavaudemymahmoudramadan.di.HttpService
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 26/04/20, 6:32 PM.
 */

//@Provides and @Binds are same things


@Module
open class HttpServiceModule {

      @Provides
      fun bindApiService() = HttpService()
}
//@Module
//abstract class HttpServiceModule {
//
//     @Binds
//     abstract fun bindApiService(httpService :HttpService) : ApiService
//}