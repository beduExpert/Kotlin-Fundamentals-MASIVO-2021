# Reto 02 - Exeptions y Manejo de errores

## OBJETIVO 

- Arrojar excepciones en casos donde se requiera.
- manejar las excepciones para evitar parar el flujo.

## REQUISITOS 

1. Terminar el [Ejemplo 02](/../../tree/master/Sesion-07/Ejemplo-02/)

## DESARROLLO

Se proponen dos ejercicios:

1. Crear una función que divida dos Int, si el divisor es 0, habrá un error: utilizar try-catch como expresión para regresar un valor y en caso de error, regresar 0.

    <details>
        <summary>Solución</summary>
        
    ```kotlin
    fun divide(num1:Int,num2:Int): Int{
        return try { num1/num2} catch (e : Exception){0}
    }
    ```

    codigo para probar

    ```kotlin
    println(divide(10,0))
    println(divide(10,2))
    ```

    </details>

    </br>

2. Requerimientos
    
    - Escribe una data Class con dos propiedades nullables (name y visitedCities) la última es una lista de nullable String, por defecto serán nulos
    -  Crea una instancia de Person y asigna valor a las dos propiedades de la clase person.
    - Itera sobre cada uno de los elementos de la propiedad visitedCities de la instancia que acabas de crear, e imprime el contenido de cada elemento si es que no es nulo, si lo es lanza una excepción.
    - En el comentario Second person crea una instancia de person con su contructor por defecto.
    - Asigna el valor del nombre de la instancia de persona que acabas de crear a una variable usando el operador Elvis, si es nulo el nombre lanza una excepción pero por medio de una función, usando el tipo Nothing (Crea la función que retorne Nothing).

    <details>
        <summary>Solución</summary>
        
    Nuestra clase

    ```kotlin
    data class Person(
        val name: String? = null,
        val visitedCities: List<String?>? =null
    )
    ```

    Error de ciudades mediante operador elvis

    ```kotlin
    val me = Person(
        name = "My Name",
        visitedCities = listOf("Mexico", null, "Brasil")
    )
    
    me.visitedCities?.forEach {
        println("Cities -> ${it ?: throw IllegalArgumentException("Ciudad vacía")}")
    }
    ```

    funcion fail

    ```kotlin
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
    ```

    Error de nombre

    ```kotlin
    val you = Person()
    val name = you.name ?: fail("No existe nombre")
    ```

    </details>


</br>

[Siguiente](../Ejemplo-03)