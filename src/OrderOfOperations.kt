fun main(){
    val x = 10
    val y = 20
    var temp = x + y * x
    println("$temp")
    println((2+3*4)-(2/4+5)/2)

    println("enter the first number:")
    var a:Double = readLine()!!.toDouble()
    println("enter the second number:")
    var b: Double = readLine()!!.toDouble()
    var c = (a + b) - (a+b)
    println("Answer: $c")
}