    val sum = {number1:Int, number2:Int -> Int
        number1 + number2
    }
fun main(){
val addnumbers:Int = sum(1,4)
    println(addnumbers)

    println("list of")
    val listOfNumber = listOf(1,2,3,4,5,6,9)
//    for (number in listOfNumber){
//        println(number)
//    }

    listOfNumber.forEach{number ->
        println(number)
    }
}
