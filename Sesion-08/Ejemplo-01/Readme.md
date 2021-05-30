# Ej. 01 - Introducción a las Coroutines

## OBJETIVO

- Generar operaciones asíncronas 
- Diferenciar entre bloqueo y suspensión

## REQUISITOS

1. Conocimiento previo de funciones asíncronas y corrutinas

## DESARROLLO

Para desarrollar este proyecto, es necesario crear nuestro proyecto tal y como se indica en el inicio de esta [Sesión](../), donde al final observamos un código de prueba, que es el siguiente:

```kotlin
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){

    println("Inicio del programa")

    // Inicio de la corrutina
    GlobalScope.launch {
        delay(1000)
        println("Delay de un segundo")
    }

    Thread.sleep(3000) // Esperar tres segundos
    println("Terminando programa")
}
```

la función ***launch*** construye y lanza una corrutina, el valor que regresa es un ***Job*** , que es una referencia a esa corrutina y es cancelable.

delay, por su parte, es un ***suspend function*** que se caracteriza por tener la capacidad de interrumpir una corrutina mientras termina de hacer su trabajo. 

El código anterior se ejecuta en estos pasos:

1. Se imprime el inicio del programa
2. se lanza la corrutina e inmediatamente se manda a suspender por un segundo debido al delay
3. Mientras tanto, el main thread se bloquea por tres segundos por el método *sleep()*
4. Termina el segundo de suspensión de la corrutina y se imprime el mensaje "Delay de un segundo"
5. Dos segundos después, se termina el bloqueo del thread principal y se imprime "Terminando programa"

Cabe mencionar que el bloqueo del main thread sucede casi al mismo tiempo de la suspensión de la rutina debido a que estas corren en paralelo.

Podemos bloquear un hilo hasta terminar la ejecución de una corrutina, para eso utilizamos la expresión ***runBlocking***

```kotlin
...
runBlocking {     // bloquear el hilo donde se corre
    delay(2000L)  //proceso de suspensión de 2 segundos
}
println("bloqueo por corrutina de 2 segundos finalizado")
```

por lo tanto, esperaremos los dos segundos que tarda nuestra rutina en finalizar para reanudar nuestro hilo principal.


</br>

[Siguiente](../Reto-01)