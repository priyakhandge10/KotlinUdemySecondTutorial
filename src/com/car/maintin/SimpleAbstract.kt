package com.car.maintin

abstract class Credit(){
    fun CreditID():String
    { return "23432dsdfds"}
    abstract fun newCredir()

}

class UserInfo(): Credit(){

    fun getInfo():String{
        return CreditID();
    }
    override  fun newCredir(){
        println(" new cart created")
    }
}

fun main(args:Array<String>){
    var user=UserInfo()
    println(user.getInfo())
}