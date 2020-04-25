package com.rxjavaudemymahmoudramadan

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.reflect.KClass

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 24/04/20, 12:25 PM.
 */

class Util {


    companion object{

        @Volatile private var logger: Logger? = null

        fun logger(kClass: KClass<MainActivity>) {

             logger  = LoggerFactory.getLogger(kClass.simpleName);

        }



    }


}