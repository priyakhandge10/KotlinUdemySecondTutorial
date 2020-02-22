package com.car.maintin

data class Person(val name:String, val age:Int, val gender:String)

fun main(){
    val person  = Person("priyanka", 26, "female")
    println("Name:${person.name}")
    println("Age: ${person.age}")
    println("Gender:${person.gender}")
}