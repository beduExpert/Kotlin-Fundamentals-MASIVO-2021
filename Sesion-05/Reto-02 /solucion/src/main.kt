

fun main(){

    val calificaciones = listOf(10,8, 9 ,5,3,2,5,1,7,6,9,4,10,3,6,2,6,5)


    //Sacar el promedio de la clase
    val promedio = calificaciones.sum().toDouble()/calificaciones.size
    println("promedio: $promedio")

    //Verificar que ningún alumno halla sacado menos de 4
    println("Los alumnos sacaron menos de 4: ${calificaciones.none{it<4}}")

    //Subir puntos extra pero no permitir que alguien tenga 11 en adelante
    val califExtra = calificaciones.map { if (it>=10) it else it + 1 }
    println("Las calificaciones con punto extra son: $califExtra")
    
}