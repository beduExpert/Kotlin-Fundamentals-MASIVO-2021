package clases

open class Enemy(val name: String, val strength:Int) :Any(){

    init {
        println("iniciando superclase de $name")
    }

    protected var direction: String ="LEFT" //la direccción hacia donde camina un enemigo

    protected fun changeDirection(){ //Cambiar el sentido de movimiento al contrario
        direction = if (direction=="RIGHT") "LEFT" else "RIGHT"
        println("$name va en dirección $direction")
    }

    protected fun die(){ //indicamos al jugador que nuestro enemigo ha muerto
        println("$name ha muerto")
    }

    open fun collision(collider: String){ //decidir qué acción ejecutar dependiendo del objeto con que se ccolisiona
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}