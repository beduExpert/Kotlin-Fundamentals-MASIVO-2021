import java.lang.Exception

fun main(){

    println(divide(10,0))
    println(divide(10,2))


    //Error de ciudades mediante operador elvis
    val me = Person(
        name = "My Name",
        visitedCities = listOf("Mexico", null,  "Brasil")
    )

    me.visitedCities?.forEach {
        println("Cities -> ${it ?: throw IllegalArgumentException("Ciudad vacía")}")
    }

    //Error de nombre con funcion fail
    val you = Person()
    val name = you.name ?: fail("No existe nombre")


}

fun divide(num1:Int,num2:Int): Int{
    return try { num1/num2} catch (e : Exception){0}
}

//clase Person
data class Person(
    val name: String? = null,
    val visitedCities: List<String?>? =null
)

// Exception function
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
