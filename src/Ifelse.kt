fun main(){
    print("Enter yoour age:")
    val age:Int = readLine()!!.toInt()
    if(age >= 19){
        println("you  could apply for job")
    }
    if (age < 19){
        println("you can not apply for job")
    }
    println("End of App")
}