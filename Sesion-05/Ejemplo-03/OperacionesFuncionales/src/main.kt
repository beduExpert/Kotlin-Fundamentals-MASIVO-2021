fun main(){

    val calificaciones = listOf(10,8, 9 ,5,3,2,5,1,7,6,9,4,10,3,6,2,6,5)

    //Aproximación imperativa ineficiente
    var aprobadosBad = mutableListOf<Int>()
    for (calificacion in calificaciones){
        if(calificacion>5){
            aprobadosBad.add(calificacion)
        }
    }
    println(aprobadosBad)



    //Aproximación funcional, respentando la inmutabilidad de los estados, las funciones puras y el flujo por funciones

    //val aprobados = calificaciones.filter{ calificacion -> calificacion>5} //aquí se nota la función lambda implementadda
    val notasAprobadas = calificaciones.filter{ it>5} //el uso de it reduce código
    println(notasAprobadas);

    //separamos las calificaciones aprobadas de las reprobadas
    val (notasAprobadas2,notasReprobadas) = calificaciones.partition { it>5}
    println(notasAprobadas2);
    println(notasReprobadas);


    val notasAlumnos =  mapOf("Lorenza" to 6, "Juan" to 4, "Martina" to 8, "David" to 7)
    val porNombre = notasAlumnos.filter { (key, value) ->  key == "David"}
    println(porNombre)


    val preciosLibres = setOf(1024.0, 2408.5, 8224.33)
    val preciosFinales = preciosLibres.map { it * 1.16 }

    println(preciosFinales)
}