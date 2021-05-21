import clases.Enemy
import clases.Goomba
import clases.Koopa
import clases.Mario
import java.util.*
import kotlin.concurrent.schedule

fun main(){

    val enemy = Goomba()

    //enemy.collision("Enemy") //al ser otro enemigo con el que se colisiona, se debe cambiar de dirección
    //enemy.collision("Weapon") //al colisionar con un arma o poder, el enemigo debe morir

    val koopa = Koopa()
    koopa.collision("Weapon")

}

