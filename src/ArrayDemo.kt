fun main(){
    println("Array app")
    println("enter the number of pets:")
    val maxSize:Int = readLine()!!.toInt()
    var number:Array<Int> = Array(maxSize){0}
    for (i:Int in 0 until maxSize){
        number[i] = readLine()!!.toInt()
    }
    println("your number using an array")
    for (i : Int in 0 until maxSize){
        println("num $i: ${number[i]}")
    }
}