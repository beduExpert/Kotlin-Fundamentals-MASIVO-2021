package clases

class Koopa:
    Enemy("Koopa",2){

    private var state = "Walking"

    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                state = "Shell"
                println("El estado es ahora $state")
            }
            "Enemy" -> changeDirection()
        }
    }

}