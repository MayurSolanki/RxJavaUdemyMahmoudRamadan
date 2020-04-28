package com.rxjavaudemymahmoudramadan.diexample

import dagger.Component

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 28/04/20, 11:35 AM.
 */
@Component(modules = [ShowCase::class])
interface VehicleComponent {

    fun  getVehicle() : VehicleCompany
    fun getVehicleFromTataCompany() : TataComapany
    fun getVehicleFromMarutiCompany() : MarutiComapany

//     fun getShowCase (): ShowCase

      fun getTataShowRoomFromShowcase() : TataShowroom
      fun getMarutiShowRoomFromShowcase() : MarutiShowroom
}