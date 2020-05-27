fun main(){
    print("Type a number for x: ")
    val x = Integer.valueOf(readLine())
    print("Type a number for y: ")
    val y = Integer.valueOf(readLine())
    println("x = $x and y = $y")

    if (x < y){
        println("1")
    } else if (y < x){
        println("-1")
    } else {
        print(0)
    }
}