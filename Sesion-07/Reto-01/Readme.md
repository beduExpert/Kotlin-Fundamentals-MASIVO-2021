## Reto 01: Null safety - Kotlin Fundamentals

### OBJETIVO 

- Comprender cómo es que kotlin evita las excepciones de tipos nulos.
- Implementar soluciones con tipos nulables.

### REQUISITOS 

1. Haber visto el [Ejemplo 01](/../../tree/master/Sesion-07/Ejemplo-01/)
2. Tener conocimiento previo sobre tipos de datos y variables.

### DESARROLLO

A continuación ponemos una serie de ejercicios:

Tenemos una lista de nombres

```kotlin 
   val names: List<String?> = listOf("Name One", null, "Name Three")
```

1. Mediante el método forEach, imprimir unicamente los valores no nulos mediante comprobación de nulos en condiciones y por safe calls.

<details>
	<summary>Solución</summary>
	
```kotlin
    // Por Condiciones
    names.forEach {
        if (it != null) {
            println(it)
        }
    }

    // Por safe call
    names.forEach { it?.let { println(it) } }	
```

</details>

2. Por medio del operador Elvis, imprimir todos los nombres anteriores. En caso de tener un nombre nulo, imprimir un mensaje notificando que la casilla esta vacía.

<details>
	<summary>Solución</summary>
	
```kotlin
   //imprimir las casillas nulas

    names.forEach {
        val printString = it ?: "No se encontró nombre en esta casilla"
        println(printString)
    }
```

</details>

3. Crear una clase *Person* que su constructor tenga como parámetros nombre y apellido. El apellido es opcional y si no se setea, es nulo. implementar dos métodos: una que regrese el apellido y si es nulo, regresar un mensaje avisando la omisión: el segundo que regrese el nombre entero y si no, arrojar un error de argumento inválido. Utilizar el operador elvis.

***Nota:*** el lado derecho del operador elvis puede servir para regresar valores o arrojar excepciones

la excepción arrojada podría ser la siguiente:

```kotlin
throw IllegalArgumentException("Necesitas apellidos")
```

<details>
	<summary>Solución</summary>
	
```kotlin
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
```

</details>

4. Probar la clase anterior con una persona con apellido, y la otra sin apellidos. Utilizar los dos métodos creados para ambos casos.






