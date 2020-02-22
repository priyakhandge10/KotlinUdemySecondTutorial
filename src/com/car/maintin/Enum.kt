package com.car.maintin

enum class Direction{
    north, south, west, east
}
fun main(args: Array<String>){
    var usedirection = Direction.east
    if (usedirection == Direction.west){
        println("yes")
    }else{
        println("no")
    }
}