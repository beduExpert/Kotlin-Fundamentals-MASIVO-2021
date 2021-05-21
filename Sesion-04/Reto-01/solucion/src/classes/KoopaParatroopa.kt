package classes

import clases.Koopa

class KoopaParatroopa: Koopa() {

    override var state= "Flying"

    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                if(state=="Shell"){
                    die()
                } else if(state=="Walking"){
                    state = "Shell"
                } else{
                    state = "Walking"
                }
            }
            "Enemy" -> changeDirection()
        }
    }

}