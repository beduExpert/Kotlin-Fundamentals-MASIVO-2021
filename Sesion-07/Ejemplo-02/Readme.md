## Ejemplo 2: Exceptions y Manejo de errores

### OBJETIVO

- Desarrollar la habilidad de prever y hacer correctamente el manejo de posibles errores en los programas.

### REQUISITOS

1. Conocimiento previo de Excepciones

### DESARROLLO

En kotlin, como en cualquier otro lenguage de programación, siempre existe la posibilidad de que se den errores, los cuales no podemos controlar. Aquí es donde nace el tema de las excepciones, estas nos permiten hacer "algo" en caso de que algun error ocurra realizando determinadas operaciones.

Todas las clases de excepción en kotlin heredan de la clase Throwable. Cada excepción tiene un mensaje, un seguimiento de pila y una causa opcional.

>Para lanzar una excepción:

```kotlin
	throw Exception("Excepción genérica")
```

Por supuesto, Kotlin tiene una lista extensa de errores para arrojar. Haciendo referencia al [Reto 1](../Reto-01), encontramos esta excepción

```kotlin
	throw IllegalArgumentException("Necesitas apellidos")
```

la forma más común de manejar errores es usando el bloque **try-catch**. La clase String contiene un método ***toInt()*** para convertir strings a enteros, siempre y cuando la String sea numérica.

Corremos el siguiente código:

```kotlin
val v = "bedu.org"
v.toInt()
```

Tendremos un error parecido a este:

<img src="./images/01.png" width="100%">

Si observamos el texto azul, obtendremos la línea de código que provocó el error. Todo lo rojo es el *stackTrace* y es util para encontrar todas las ejecuciones de funciones durante ese error y encontrar la raíz del problema.

Utilizamos ahora try-catch para manejar la posibilidad de tener un error:

```kotlin
try {
        val v = "bedu.org"
        v.toInt()
    } catch(e:Exception) {
        println("No se pudo convertir, hubo un error: $e")

    } finally {
        println("Proceso terminado")
    }
}
```

Podemos especificar bien el tipo de error:

```kotlin
catch(e:NumberFormatException) {
...
```

También podemos imprimir el stackTrace mediante el método ***printStackTrace***

```kotlin
e.printStackTrace()
```


El bloque **try-catch** también se puede usar como una expresion:

```kotlin
val possibleNumber = "bedu.org"
val a: Int? = try { possibleNumber.toInt() } catch (e: NumberFormatException) { null }

println("El numero convertido es: $a")
```

El bloque también puede cachar distintas excepciones, en este ejemplo agregaremos la posibilidad de tener un error al dividir entre cero:

```kotlin
try {
        val v = "bedu.org"
        v.toInt()
        val divider = 0
        val a = 3/divider //comentar para reproducir el primer error

    } catch(e:NumberFormatException) {
        println("No se puede convertir este tipo a numerico:")
        e.printStackTrace()

    }catch(e:Exception){
        println("No se pudo convertir, hubo un error: $e")
    } finally {
        println("Proceso terminado")
    }
```


Vamos a utilizar un ejemplo de uso de try-catch:

Supongamos una tienda de renta de camisas online. La clase para representar una camisa es la siguiente:

```kotlin
class Shirt(){
    var available = true

    fun reserve(){
        if(available){
            available = false
            println("Reservación efectuada")
        }
    }

    fun unreserve(){
        available = true
        println("Reservación cancelada")
    }
}
```

podemos reservar las camisas y liberar la reservación. Ahora crearemos un *List* con todas las camisas disponibles en stock.

```kotlin
val stock = listOf(Shirt(),Shirt(),Shirt(),Shirt(),Shirt())
```

Tenemos 5 camisas en el stock, y un cliente quiere reservar 7 para un evento. la varialble *shirtsToRent* la determina el cliente, por lo tanto lo metemos en un ciclo para reservar las camisas.

```kotlin
 //vamos a intentar comprar 7 camisas
        val shirtsToRent = 7
        val end = shirtsToRent -1

        for(i in 0..end ){
            stock[i].reserve()
        }
```
Si corremos este ejemplo, nos va a salir el siguiente error:

<img src="images/error.png">

por lo tanto, tendremos que usar un try-catch que, en caso de error, quitemos la reserva de las camisas en stock. El ejemplo quedaría así:

```kotlin
val stock = listOf(Shirt(),Shirt(),Shirt(),Shirt(),Shirt())

    try {
        //vamos a intentar comprar 7 camisas
        val shirtsToRent = 7
        val end = shirtsToRent -1

        for(i in 0..end ){
            stock[i].reserve()
        }

    } catch(e:ArrayIndexOutOfBoundsException) {
        println("No hay suficientes camisas en stock, por favor disminuye la cantidad")

        stock.forEach {
            it.unreserve()
        }

    } finally {
        println("Gracias por su preferencia")
    }
```



#### The nothing type

Ya que throw es una expresión se puede usar por supuesto en una operación Elvis.

```kotlin
	val s = person.name ?: throw IllegalArgumentException("Name required")
```

Vemos que intentamos asignar el nombre de la persona a la variable **s**, con el uso del operador Elvis se lo asignamos. Si este lo tiene, si no lo tiene lanzamos una excepcion.

El tipo de la expresión throw es el tipo especial Nothing. Este tipo no tiene valores y se usa para marcar ubicaciones de código que nunca se pueden alcanzar. En su propio código, puede usar Nothing para marcar una función que nunca regresa:

```kotlin
	fun fail(message: String): Nothing {
		throw IllegalArgumentException(message)
	}
```

Cuando usamos el tipo Nothing, estamos básicamente indicando que la función no va a regresar nada, en este caso nuestra función se encarga solamente de lanzar una excepción.

Cuando llames a esta función, el compilador sabrá que la ejecución no continúa más allá de la llamada:

```kotlin
	val s = person.name ?: fail("Name required")
```

Ahora vemos que de esta forma, con ayuda del tipo Nothing, combinándolo con el uso de Elvis, podemos mejorar nuestro código para lanzar excepciones, completa el [Reto 02](/../../tree/master/Sesion-07/Reto-02/) y pon en práctica lo que acabas de aprender.
