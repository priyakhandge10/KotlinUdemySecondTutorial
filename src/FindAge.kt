fun main(){
    println("enter your year of birth:")
    val yearofbirth: Int = readLine()!!.toInt()
    val age:Int = 2020 - yearofbirth
    println("you are $age years old")
}

