fun main() {

    //DATA CLASS

    //declaración
    val scaryMovie = Movie("Scary movie", "Comedia", 88.27)
    //impresión
    println(scaryMovie)

    //imprimir una propiedad en específico
    println(scaryMovie.name)

    //asignamos e imprimimos la propiedad createdAt
    scaryMovie.createdAt = "2000"
    println("fecha de creación: ${scaryMovie.createdAt}")

    //imprimir una propiedad con componentN
    println(scaryMovie.component2())

    //Desestructuración
    val (_,gender,duration) = scaryMovie
    println("la duración de la película es de $duration minutos")

    //copiando objeto
    val scaryMovie2= scaryMovie.copy(name="Scary movie 2",duration=83.0)
    println("""
        Scary movie: $scaryMovie
        Scary movie 2: $scaryMovie2
    """.trimIndent())

    println("fecha de creación de ${scaryMovie2.name}: ${scaryMovie2.createdAt}")

    //llamamos al método create del companion object en Vehicle
    val vehicleInstance = Vehicle.create()


}