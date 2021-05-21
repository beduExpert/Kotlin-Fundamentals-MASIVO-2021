import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread

fun main(){
    val coroutineNum = AtomicLong()

    measureTimeMillis {
        for (i in 1..1_000_000L)
            GlobalScope.launch {
                coroutineNum.addAndGet(i)
            }
    }

    println("valor del número: ${coroutineNum.get()}")


    val threadNum = AtomicLong()

    measureTimeMillis {
        for (i in 1..1_000_000L)
            thread(start = true) {
                threadNum.addAndGet(i)
            }
    }

    println("valor del numéro: ${threadNum.get()}")






}

inline fun measureTimeMillis(block: () -> Unit){
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis() - start
    println("Tiempo transcurrido: ${end/1_000L} segundos")
}