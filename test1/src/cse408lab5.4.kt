import java.io.File

fun main(args:Array<String>){
    try{
        val fileName = "demo1.txt"
        val lines:List<String> =File(fileName).readLines()
        lines.forEach{ line -> println(line)}

    }catch(e:Exception){
        e.printStackTrace()
    } finally{
        println("File read successfully")
    }
}