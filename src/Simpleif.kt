fun main(){
    println("enter your grade: ")
    val grade: Int = readLine()!!.toInt()
    if(grade >= 90){
        println("A")
    }
    if(grade in 80..89){
        println("B")
    }
    if(grade in 60..79){
        println("C")
    }
    println("End of App")
}