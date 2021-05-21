package clases

open class Koopa:
    Enemy("Koopa",2){

    protected open var state = "Walking"
    set(value) {
        field = value
        println("El estado es ahora $value")
    }

    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                if(state=="Shell"){
                    die()
                } else{
                    state = "Shell"
                }
            }
            "Enemy" -> changeDirection()
        }
    }

}