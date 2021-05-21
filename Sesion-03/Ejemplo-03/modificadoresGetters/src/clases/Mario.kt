package clases

class Mario(var vidas: Int =3){ //vamos a dejar setear el número de vidas al iniciar el objeto Mario

    init {
        println("It's a me! Mario!")
    }

    private var state = "small" //mario es pequeño al iniciar el juego
    set(value) {
        field = value
    }
    get() = field

    private var lives = 3 //uno empieza el juego con tres vidas
    set(value){
        if(field == 1){ //si teníamos una vida, se termina el juego
            field = 0
            gameOver()
        } else if(field==0){ //si ya teníamos 0 vidas, no haz reiniciado el juego
            println("Necesitas volver a jugar")
        }
        else{
            field=value //podemos asignar el valor correctamente
        }
    }

    private fun gameOver(){
        println("JUEGO TERMINADO")
    }

    fun getLives(): String{
        return "$lives vidas"
    }

    //el modificador public es redundante
    //en función del objeto colisionante, se ejecuta un evento
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba" -> lives--
                "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire mario"
            else -> println("Objeto desconocido ¡no pasa nada!")

        }
    }
}