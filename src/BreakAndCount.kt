fun main(){
    println("continue example")
    for (num: Int in 1..10){
    if (num==4){
        continue
    }
        println(num)
    }
    println("break example")
for (num: Int in 1..10){
    if (num==4) {
        break
    }
    println(num)
}
    println("inner break")
    for (number: Int in 1..5){
        println("Number: $number")
        for (inner : Int in 1..10){
            println("innerloop: $inner")
            if (inner == 6){
                break
            }
        }
    }
}