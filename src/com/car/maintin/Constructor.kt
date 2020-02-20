package com.car.maintin

class Constructor(){
    var type:String?= null
    var model:Int?= null
    var price:Double?= null
    var milesdrive:Int?=null
    var owner:String?= null
    constructor( type:String,  model:Int,  price:Double,  milesdrive: Int, owner:String):this(){
        this.type =type
        this.model = model
        this.price = price
        this.milesdrive = milesdrive
        this.owner = owner
    }


    constructor( type:String,  model:Int,  price:Double,  milesdrive: Int):this(){
        this.type =type
        this.model = model
        this.price = price
        this.milesdrive = milesdrive

    }



    fun getCarPrice():Double{
        return this.price!!-(this.milesdrive!!.toDouble()*10)

    }
}

fun main(){
    var car = Constructor("BMW",2020, 100.00,20,"priyanka")
    println("--------------")
    println(car.type)
    println(car.model)
    println(car.price)
    println(car.milesdrive)
    println(car.owner)
    println(car.getCarPrice())

    var car1 = Constructor("toyota",2019, 120.00,10)
    println("------------")
    println(car1.type)
    println(car1.model)
    println(car1.price)
    println(car1.milesdrive)
    println(car1.getCarPrice())
}