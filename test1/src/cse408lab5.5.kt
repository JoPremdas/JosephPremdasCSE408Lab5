fun main() {
    val a = MathTeacher()
        a.teachMath()
    val b = Footballer()
        b.playFootball()
    val c = Businessman()
        c.runBusiness()
}
open class Person{
    fun talk() {}
    fun walk(){}
    fun eat(){}
}
class MathTeacher: Person() {
    fun teachMath(){
        println("I am a teacher at CSUSB")
    }
}
class Footballer: Person() {
    fun playFootball(){
        println("I play Football for LA Rams")
    }
}
class Businessman: Person() {
    fun runBusiness(){
        println("I work for Google")
    }
}


