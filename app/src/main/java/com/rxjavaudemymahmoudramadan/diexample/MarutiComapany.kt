package com.rxjavaudemymahmoudramadan.diexample

import android.util.Log
import javax.inject.Inject

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 28/04/20, 11:00 AM.
 */
class MarutiComapany @Inject constructor(): VehicleInterface {

    override fun launchCar() {
        Log.d("DI","  launchCar from MarutiComapany ")

    }

    override fun launchBike() {
        Log.d("DI","  launchBike from MarutiComapany ")

    }


}