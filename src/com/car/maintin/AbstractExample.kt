package com.car.maintin

abstract class Teacher(name:String){
    init {
        println("my name is: $name")
    }
    abstract fun displayinfo(place:String)

}

class student(name: String): Teacher(name){
    override fun displayinfo(place: String){
    println("Place: $place")
    }
}

fun main(args: Array<String>){
    val stud = student("priyanka")
    stud.displayinfo("thane")
}