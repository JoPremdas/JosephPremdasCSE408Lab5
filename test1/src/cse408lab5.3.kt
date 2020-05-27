fun main(){
    val cardPoints = 7000

    when (cardPoints){
        in 0..999 -> println("You have $cardPoints point(s) and are at the PEARL level.")
        in 1000..4999 -> println("You have $cardPoints point(s) and are at the SILVER level.")
        in 5000..9999 -> println("You have $cardPoints point(s) and are at the GOLD level.")
        !in 0..9999 -> println("You have $cardPoints point(s) and are at the PLATINUM level.")
    }
}