class Vehicle {

    init{
        println("Vehículo creado")
    }
    companion object Factory {
        fun create(): Vehicle = Vehicle()
    }
}