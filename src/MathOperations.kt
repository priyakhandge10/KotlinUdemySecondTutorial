fun main(){
    println("----Simple math operations example----")
    println("Enter the first number:")
    val x:Double = readLine()!!.toDouble()
    println("Enter the second number:")
    val y:Double = readLine()!!.toDouble()
    val sum:Double = x + y
    println("sum: $sum")
    val sub:Double = x - y
    println("sub: $sub")
    val mul:Double = x * y
    println("mul: $mul")
    val div:Double = x / y
    println("div: $div")

}