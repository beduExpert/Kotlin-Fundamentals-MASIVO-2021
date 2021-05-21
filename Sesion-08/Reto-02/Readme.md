 ## Suspend functions y composing

### OBJETIVO 

- Complementar el conocimiento adquirido de suspend functions
- Componer series de suspend functions

#### REQUISITOS 

1. Haber cursado el [Ejemplo 2](../Ejemplo-02)

#### DESARROLLO

1. Crear una suspend function por cada producto para regresar su respectivo precio: 


* La Ps4 cuesta $5299 y el servidor tarda 3 segundos en obtener el precio
* El scooter cuesta $2400 y el servidor tarda 2 segundos en obtener el precio

<details>
	<summary>solucion</summary>
	
```kotlin
suspend fun getScooterPrice():Long{
    println("Obteniendo precio...")
    delay(2_000)
    return 2400L
}

suspend fun getPs4Price():Long{
    println("Obteniendo precio...")
    delay(3_000)
    return 5299L
}
```

</details>

2. Obtener el precio del scooter en la función main() e imprimirlo en pantalla

<details>
	<summary>solucion</summary>
	
```kotlin
  runBlocking{
        val price = getScooterPrice()
        println("El precio del scooter es: $price")
    }
```

</details>


3. Obtener el precio de la ps4 y el scooter, imprimirlo en pantalla


<details>
	<summary>solucion</summary>
	
```kotlin
runBlocking {
        val scooterPrice = getScooterPrice()
        val ps4Price = getPs4Price()

        val totalPrice = scooterPrice + ps4Price
        println("El precio total es: $totalPrice")
    }
```

</details>

4. Existe una forma de obtener resultados de forma asíncrona. el método ***async*** lanza una corrutina, como *launch*, la diferencia es que, en vez de regresar un Job, regresa un Deferred (un objeto que representa una promesa de retornar un resultado en algún momento). en el Deferred, viene un método ***await()*** que devuelve el resultado. Con esta información, obtener el valor de los dos productos de forma asíncrona para luego sumarlos e imprimirlos en pantalla.

<details>
	<summary>solucion</summary>
	
```kotlin
runBlocking {
        val scooterResult = async {getScooterPrice()}
        val ps4Result = async {getPs4Price()}

        val totalPrice = scooterResult.await() + ps4Result.await()
        println("El precio total es: $totalPrice")
    }
```

</details>

5. con la función de orden superior ***measureTimeMillis*** se puede obtener el tiempo durante la ejecución de una operación. Imprimir el tiempo en que se tarda en ejecutar los dos ejercicios anteriores, comparar los tiempos y discutir la diferencia entre estos dos.
