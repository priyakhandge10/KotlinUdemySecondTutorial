fun main(){
    for (userID in 1..2){
        println("$userID enter your name:")
        var name :String = readLine()!!.toString()
        println("where you live")
        var livePlace: String = readLine()!!.toString()
        var petName:String?=""
        println("enter number of pets:")
        var petsCount:Int = readLine()!!.toInt()
        for (petID: Int in 1..petsCount){
            println("enter the petID: $petID")
             petName = petName + readLine()!!.toString() + ","
        }
        println("user info")
        println("Name: $name")
        println("livePlace: $livePlace")
        println("petName: $petName")
    }
}