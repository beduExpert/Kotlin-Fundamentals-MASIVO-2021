import kotlinx.coroutines.*

fun main(){

    //Haciendo join a un job
    runBlocking {
        val job = GlobalScope.launch {
            delay(1000L)
            println("Mundo!")
        }
        println("Hola,")
        job.join()
    }


    runBlocking {
        val buyJob = launch(Dispatchers.Default) {
            var percentage = 0

            while (percentage<100){
                println("procesando pago: $percentage%")
                delay(500)
                percentage+=10
            }
            println("Pago exitoso!")
        }
        delay(2000)
        buyJob.cancel()
    }


}