fun main(){
var listOfUsers = HashMap<Int, String>()
    listOfUsers[1] = "priyanka"
    listOfUsers[2] = "priya"
    listOfUsers[2] = "priyanka"

    for (key: Int in listOfUsers.keys)
    println("$key ${listOfUsers[key]}")
}