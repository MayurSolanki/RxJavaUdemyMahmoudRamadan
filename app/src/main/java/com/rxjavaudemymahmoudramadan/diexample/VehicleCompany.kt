package com.rxjavaudemymahmoudramadan.diexample

import android.util.Log
import javax.inject.Inject

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 28/04/20, 11:04 AM.
 */
class VehicleCompany {




    val mMarutiComapany : MarutiComapany
    val mTataComapany : TataComapany

    companion object Factory {
        fun getVehicle(): VehicleCompany {
            val vehicle = VehicleCompany(MarutiComapany(), TataComapany())
            return vehicle
        }
    }


    @Inject
    constructor(marutiComapany: MarutiComapany,tataComapany: TataComapany){
         this.mMarutiComapany = marutiComapany
        this.mTataComapany = tataComapany


     }


      fun launchForWheerler(){

          Log.d("DI"," launchForWheerler from Vehicle class ")

          mMarutiComapany.launchCar()
          mTataComapany.launchCar()
      }

    fun launchTwoWheeler(){

        Log.d("DI","  launchTwoWheeler from Vehicle class ")

        mMarutiComapany.launchBike()
        mTataComapany.launchBike()

    }
}