import clases.Vehiculo

fun main(){

    val miVehiculo = Vehiculo()

    miVehiculo.color="Verde"
    miVehiculo.marca="Ford"
    miVehiculo.modelo="Focus"
    miVehiculo.placas="REM-4123"

    println("El coche está prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche está prendido? ${miVehiculo.encendido}")

    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El tanque tiene ${miVehiculo.gasolina}")
}