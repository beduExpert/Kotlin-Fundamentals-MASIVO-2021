import clases.Phone

fun main(){

    val a=20
    println("a es igual a 20? ${a.equals(20)}")

    val myPhone = Phone()

    myPhone.getTurn()
    myPhone.turnOn()
    myPhone.getTurn()

}