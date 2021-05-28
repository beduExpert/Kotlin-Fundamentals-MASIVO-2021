# Ej. 02 - Threads vs Coroutines

## OBJETIVO

- Corroborar el bajo costo de recursos que implica el uso de una coroutine frente a un Thread

## REQUISITOS

1. Conocimiento básico de Threads
2. Saber ejecutar coroutines

## DESARROLLO

Este ejemplo se centrará en mostrarnos el performance de múltiples ***threads*** ejecutando una tarea sencilla vs ***coroutines*** haciendo lo mismo.

Creamos primero una función que sea capaz de obtener el tiempo transcurrido durante la ejecución de una tarea. Obtenemos el tiempo actual en milisegundos desde el inicio del bloque y después de su ejecución, después imprimimos el valor.

```kotlin
inline fun measureTimeMillis(block: () -> Unit){
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis() - start
    println("Tiempo transcurrido: ${end/1_000L} segundos")
}
```

Ahora, vamos a utilizar un valor numérico **AtomicLong** que es un Long que se actualiza automáticamente. Lanzamos un millón de coroutines con un ciclo for, y medimos el tiempo de ejecución. Después, imprimimos el valor de nuestro número.

```kotlin
val coroutineNum = AtomicLong()

measureTimeMillis {
    for (i in 1..1_000_000L)
        GlobalScope.launch {
            coroutineNum.addAndGet(i)
        }
}

println("valor de c: ${coroutineNum.get()}")
```

El resultado de esta ejecución dio lo siguiente: 

```kotlin
Tiempo transcurrido: 1 segundos
valor del número: 500000500000
```

De la misma forma, vamos a correr un millón de hilos

```kotlin
val threadNum = AtomicLong()

measureTimeMillis {
    for (i in 1..1_000_000L)
        thread(start = true) {
            threadNum.addAndGet(i)
        }
}

println("valor del numéro: ${threadNum.get()}")
```

En mi caso, este fue mi resultado:

```kotlin
Tiempo transcurrido: 59 segundos
valor del numero: 500000500000
```

La diferencia es de aproximadamente 58 segundos por la ejecución de una tarea sencilla, pero para tareas más complejas, el costo es mayor.



</br>

[Siguiente](../Ejemplo-03)