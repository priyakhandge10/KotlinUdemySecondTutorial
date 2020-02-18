fun main(){
    println("Start The App")
    for (i: Int in 1..10){
        println("$i Kotlin Tutorial")
    }
    println("Increment")
    for (i: Int in 1..10 step 2){
        println("$i kotlin tutorial")
    }
    println("Decrement")
    for (i: Int in 10 downTo 1){
        println("$i kotlin tutorial")
    }
    for (i: Int in 10 downTo 1 step 1){
        println("$i kotlin tutorial")
    }
}