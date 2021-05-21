## Estructuras de datos

### OBJETIVO

- Comprender el uso de los distintos tipos de colecciones que en kotlin.
- Usar las operaciones e iteraciones más comunes sobre colecciones en kotlin.

### REQUISITOS

1. Completar la  [Sesion 1](../../Sesion-01) y especialmente haber comprendido los temas:
    - Tipos de datos.
    - Operadores.

### DESARROLLO

Una colección generalmente contiene una cantidad de objetos (este número también puede ser cero) del mismo tipo. Los objetos en una colección se llaman elementos o ítems. Por ejemplo, todos los estudiantes en un departamento forman una colección que se puede usar para calcular su edad promedio. Kotlin nos ofrece los siguientes tipos de colecciones:

#### List
Una **lista** es una colección ordenada con acceso a elementos por índices, números enteros que reflejan su posición. Los elementos pueden aparecer más de una vez en una lista. Un ejemplo de una lista es una oración: es un grupo de palabras, su orden es importante y pueden repetirse.
Los elementos en una lista sí están ordenados y sus índices van desde 0 que es el primer elemento hasta list.size - 1 que es el último elemento.

>Declaración de una lista.
```kotlin
    val numeros = listOf("one", "two", "three", "four", "five")
```
Un arreglo puede imprimirse directamente

```kotlin
println(numeros)
```
El arreglo se muestra de la siguiente forma:

> [one, two, three, four, five]

Es realmente sencillo hacerlo, pero veamos qué hay detrás de la lista en cuanto a los índices se refiere.

```kotlin
    println("Numero de elementos: ${numeros.size}")
    println("Segundo elemento: ${numeros.get(1)}") 
    println("Cuarto elemento: ${numeros[3]}")
    println("Ultimo elemeto: ${numeros.get(numeros.size - 1)}")
    println("Index del elemento \"four\": ${numeros.indexOf("four")}")
```

Si usamos este tipo **List<T>** tenemos que saber que no es mutable, es decir **no podemos alterar sus elementos**, para ello tenemos **MutableList<T>** lo cual representa una lista, a la cual sí podemos agregar, leer, eliminar o modificar sus elementos:

```kotlin

    val numer = mutableListOf(1, 2, 3, 4)
    //Abrebar nuevos elementos
    numeros.add(5)
    //Remover elementos
    numeros.removeAt(1)
    //Modificar elementos
    numeros[0] = 0
    
    println(numeros)

```
Como puedes notarlo, las listas son semejantes a los Arrays que ya habíamos visto, pero a diferencia de los arreglos, las listas no tienen un tamaño definido. Este va cambiando conforme se añaden o remueven elementos.


#### Set

Un **set** es un operación que regresa una serie de elementos **únicos**, es decir, que no se repiten. Por ejemplo, el alfabeto es un **set** de letras.
Un set almacena elementos únicos, incluso con los valores null.
Un conjunto regresa un set (conjunto) inmutable usamos la funcion setOf(). Esto nos creará una instancia de un conjunto, en el cual no podremos realizar operaciones de escritura. Para realizar operaciones de escritura sobre un set lo creamos con la funcion mutableSetOf()

>Creando sets.
```kotlin
    //Creamos dos sets con valores únicos y desordenados en comparación entre ambos.
    val numSet: Set<Int> = setOf(0, 1, 2, 3, 4, 5)
    val reverseNumSet: Set<Int> = setOf(5, 4, 3, 2, 1, 0)

    //Creamos un set mutable
    var names: Set<String> = mutableSetOf("Nombre 1", "Nombre 2")
```
Si comparamos los dos sets inmutables del principio del ejemplo anterior, el resultado será true, ya que no importa el orden de los elementos.

#### Map
El mapa (o diccionario) es un conjunto de pares clave-valor. Las claves son únicas y cada una de ellas se asigna exactamente a un valor. Los valores pueden ser duplicados. Los mapas son útiles para almacenar conexiones lógicas entre objetos, por ejemplo, la identificación de un empleado y su posición.

Para crear una colección Map inmutable o de solo lectura en Kotlin, usamos la función **mapOf()**. Creamos un mapa con esta función dándole una lista de pares. El primer valor es la clave, y el segundo es el valor. Llamar a esta función devuelve una interfaz tipo **Kotlin Map**.

Supongamos que queremos crear un mapa en el que asociemos el nombre de usuario con la edad, es decir, cada edad corresponde a un nombre de usuario. Recordando tipos de datos, es importante notar que el nombre de usuario es un String y que la edad es un Int, de modo que nuestro mapa quedaría de la siguiente forma.
```kotlin
    val namesToAges: Map<String, Int> = mapOf("unser_one" to 20, "user_two" to 23)
```
Observa que como definimos nuestro mapa, el primer elemento es un **String** y el segundo es un **Int**, por esto, cuando creamos la instancia de nuestro mapa con la función mapOf() asignamos un elemento Int a una clave String con la palabra reservada **to**.

Un punto importante es que cuando iteramos sobre un mapa, o sea, recorrer cada uno de sus elementos, podremos acceder tanto a la clave como al valor, un ciclo for nos permite hacerlo de la siguiente forma.
>Iterando un mapa
```kotlin
    for ((key, value) in namesToAges) {
        println("$key tiene $value años")
    }
```
Al igual que las listas (list) y los conjuntos (set) la función mapOf() nos crea un mapa inmutable. Si queremos hacer operaciones de escritura sobre un mapa tenemos que crearlo con la función mutableMapOf().

