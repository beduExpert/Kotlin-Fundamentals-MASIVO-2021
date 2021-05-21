## Reto final - Manejando errores

### OBJETIVO
- Evitar crashes en nuestra aplicación
- Manejar de forma estratégica los errores 

#### REQUISITOS

1. Terminar los ejercicios y retos de esta sesión.

#### DESARROLLO

Kotlin maneja de forma mucho más inteligente los NullPointerException que java, y eso es algo bueno debido a que este es uno de los errores más comunes cometidos por programadores. Además, ofrece herramientas ya conocidas para manejo de errores, como ***try-catch*** que se utiliza en muchos lenguajes de programación.

Aquí damos algunas formas de manejar mejor los errores.

1. En un ambiente controlado como un proyecto prueba, uno de los mayores riesgos de tener un error en Runtime podría ser al momento de ingresar un dato desde la consola 

```kotlin
    print("Escribe un número: ")
    val number = Integer.valueOf(readLine())
    println("Has ingresado el número: $number")
```

Si ingresas un valor numérico, no habrá ningún inconveniente, de lo contrario, podría generarse una excepción como la siguiente:

```kotlin
  Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
```

Como nuestra excepcion es NumberFormatException, podemos manejar el error de la siguiente forma:

```kotlin
    print("Escribe un número: ")

    try{
        val number = Integer.valueOf(readLine())
        println("Has ingresado el número: $number")

    } catch (e: NumberFormatException){
        println("Por favor, escribe una opción válida")
    }
```

2. No recomendamos el uso del not-null assertion operator (**!!**) puesto que puede traer NPE's indeseados, sin adquirir ninguna ventaja en particular.

3. Para cualquier lista que pudiera almacenar un valor nulo, podemos utilizar el método ***filterNotNull*** que deja pasar únicamente a los valores no nulos

```kotlin
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()

    println(intList)
```
