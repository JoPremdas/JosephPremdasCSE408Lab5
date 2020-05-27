fun main(){
    println("Please give us an age between 0 and 100")
    println("Age: ")
    val age = Integer.valueOf(readLine())
    when (age){
        in 0..20 -> print("This is the family range.")
        in 21..59 -> print("This is the normal range.")
        in 60..100 -> print("This is the senior range.")
        else -> print("OUT OF RANGE")
    }
}