fun main(){
    println("Swap after two number:")
    var x = 10
    println("x:" +x)
    var y = 20
    println("y:" +y)
    val temp = x
    x = y
    y = temp
    println("Swap before two number:")
    println("x:$x")
    println("y:$y")
}