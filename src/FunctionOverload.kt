
fun squre(num:Int) = num * num
fun squre(num:Double) = num * num
fun add(num1:Int, num2:Int):Int{
    return num1 + num2
}

fun add(num1: Int, num2: Int, num3: Int):Int{
    return num1+num2+num3
}

fun add(num1:Double, num2:Double,num3: Int):Double{
    return num1+num2+num3
}

fun main(){
    println(squre(6))
    println(squre(2.0))
    println(add(2,2))
    println(add(2,4,3))
    println(add(1.0,3.0,2))
}