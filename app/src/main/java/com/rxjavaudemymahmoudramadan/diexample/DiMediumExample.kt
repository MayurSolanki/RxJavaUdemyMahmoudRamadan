package com.rxjavaudemymahmoudramadan.diexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rxjavaudemymahmoudramadan.R

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 28/04/20, 10:57 AM.
 */
class DiMediumExample : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_di_medium_example)


//        val marutiComapany = MarutiComapany()
//        val tataComapany = TataComapany()
////        val vehicle  =Vehicle(marutiComapany = MarutiComapany(),tataComapany = TataComapany())
//        val vehicle  =Vehicle(marutiComapany = marutiComapany,tataComapany = tataComapany)
//
//        vehicle.launchTwoWheeler()
//        vehicle.launchForWheerler()



//        val daggerVehicleComponent : VehicleComponent = DaggerVehicleComponent.create()
//        daggerVehicleComponent.getVehicle().launchForWheerler()


        // Get Vehicle from Vehicle company (Tata and Maruti)
        val daggerVehicleComponent : VehicleComponent =   DaggerVehicleComponent.builder().build()
        daggerVehicleComponent.getVehicle()


        // Get showroom from Showcase
        val tataShowroom = TataShowroom()
        val marutiShowroom = MarutiShowroom()
        val showCase : ShowCase = ShowCase(tataShowroom,marutiShowroom);
        val daggerVehicleComponentt : VehicleComponent =   DaggerVehicleComponent.builder().showCase(showCase).build()

        daggerVehicleComponentt.getMarutiShowRoomFromShowcase()
        daggerVehicleComponentt.getTataShowRoomFromShowcase()




//        val marutiComapany = MarutiComapany()
//        val tataComapany = TataComapany()
//
//
//        marutiComapany.launchBike()
//        marutiComapany.launchCar()
//
//        tataComapany.launchBike()
//        tataComapany.launchCar()



    }

}