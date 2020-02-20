fun userInfo(name:String, ID:Int){
    println("Name: $name")
    println("ID: $ID")
}
fun userInfo(userID:Int){
println("UserID: $userID")
}

fun main(){
    userInfo(1)
    userInfo("priyanka" ,2)

}