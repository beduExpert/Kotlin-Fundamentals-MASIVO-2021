package clases

class Phone {

    //atributos
    var isOn = false
    lateinit var model:String

    //métodos
    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getTurn(){
        val turnMode = if(isOn) "Encendido" else "Apagado"
        println("el teléfono esta $turnMode")
    }
}