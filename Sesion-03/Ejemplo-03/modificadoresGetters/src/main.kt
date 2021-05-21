import clases.Mario

fun main(){

    var mario = Mario()

    for(i in 1..4){ //matando a mario 5 veces
        mario.collision("Goomba")
        println("Te quedan ${mario.getLives()}")
    }
}