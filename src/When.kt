fun main(){
    println("Pick food menu:")
    val foodID: Int = readLine()!!.toInt()
    when(foodID){
        1 -> {
            println("you got the coffee")
            println("you got the tea")
        }
        5 -> {
            println("you got salat")
        }
        else ->{
            println("you did not order anything")
        }
    }
}