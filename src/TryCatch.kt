fun main() {
    try {
        println("Enter the number:")
        var n2: Int = readLine()!!.toInt()
        val Div = 100 / n2
        println("div: $Div")
    }catch (ex:Exception){
        println(ex.message)
    }
}