fun main(){
    val isMarried = false
    val GPA = 3.8
    val isQualified = if (isMarried ==true && GPA >= 3.8) 1 else 0
    println(isQualified)
    val isGood:Boolean = when(GPA){
        4.0->true
        else->false
    }
    println(isGood)
}
