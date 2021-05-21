import java.lang.IllegalArgumentException

fun main(){

    val names: List<String?> = listOf("Name One", null, "Name Three")

    // Por Condiciones
    names.forEach {
        if (it != null) {
            println(it)
        }
    }

    // Por safe call
    names.forEach { it?.let { println(it) } }


    //imprimir las casillas nulas

    names.forEach {
        val printString = it ?: "No se encontró nombre en esta casilla"
        println(printString)
    }


    val person = Person("Pedro","Páramo")
    println(person.getLastName())
    println(person.getFullName())

    val person2 = Person("Daniel")
    println(person2.getLastName())
    println(person2.getFullName())
}

class Person(
    private val name:String,
    private val lastName:String? = null){

    fun getFullName(): String {
        val lName =  lastName ?: throw IllegalArgumentException("Necesitas apellidos")
        return "$name $lName"
    }

    fun getLastName() : String {
        val lName = lastName ?: return "No se encontró apellido"
        return lName
    }

}