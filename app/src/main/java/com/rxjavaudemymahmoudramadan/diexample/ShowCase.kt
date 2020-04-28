package com.rxjavaudemymahmoudramadan.diexample

import dagger.Module
import dagger.Provides
import javax.inject.Inject

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 28/04/20, 11:58 AM.
 */

@Module
open class ShowCase {

    var mTataShowroom  : TataShowroom
    var mMarutiShowroom : MarutiShowroom


     init {

     }

    @Inject
    constructor(tataShowroom : TataShowroom,marutiShowroom: MarutiShowroom){

        this.mTataShowroom = tataShowroom
        this.mMarutiShowroom = marutiShowroom


    }




    @Provides
     fun getTataShowCase(): TataShowroom{

        return mTataShowroom
     }

    @Provides
    fun getMarutiShowCase(): MarutiShowroom{

        return mMarutiShowroom
    }

}

