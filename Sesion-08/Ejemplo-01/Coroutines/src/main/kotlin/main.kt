import kotlinx.coroutines.*

fun main(){

    println("Inicio del programa")

// Inicio de la corrutina
    GlobalScope.launch {
        delay(1000)
        println("Delay de un segundo")
    }

    Thread.sleep(3000) // Esperar tres segundos
    //println("Terminando programa")
    println("Tres segundos bloqueando el thread")

    runBlocking {     // bloquear el hilo donde se corre
        delay(2000L)  //proceso de suspensión de 2 segundos
    }
    println("bloqueo por corrutina de 2 segundos finalizado")

}