import java.io.FileWriter

fun WriteToFile(str:String){
    try {
        var fo = FileWriter("file.txt")
        fo.write(str+ '\n')
        fo.close()
    }catch (ex:Exception){
        println(ex.message)
    }
}

fun main(args:Array<String>){
    println("write file contains")
    var str:String = readLine()!!.toString()
    WriteToFile(str)
}