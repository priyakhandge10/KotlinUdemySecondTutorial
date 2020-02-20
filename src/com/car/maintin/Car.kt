package com.car.maintin

class Car(val type:String, val model:Int, val price:Double, val milesdrive: Int, val owner:String){
    init {
        println("object class is created")
    }
    fun getCarPrice():Double{
        return this.price-(this.milesdrive.toDouble()*10)

    }
}

fun main(){
    var car = Car("BMW",2020, 100.00,20,"priyanka")
    println(car.type)
    println(car.model)
    println(car.getCarPrice())

    var car1 = Car("toyota",2021, 220.22,311,"priya")
    println(car1.type)
    println(car1.model)
    println(car1.getCarPrice())
}