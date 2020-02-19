fun main(){
    var x = 10
    var y = 20
    println("Before swaping number:")
    println("X: $x")
    println("Y: $y")

    x = x + y
    y = x - y
    x   = x - y
    println("After swaping number:")
    println("X: $x")
    println("Y: $y")

}