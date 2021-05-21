import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main(){

    //obteniendo un solo precio
    runBlocking{
        val price = getScooterPrice()
        println("El precio del scooter es: $price")
    }

    //obteniendo el precio del scooter y la play 4 secuencialmente
    val secuentialTime = measureTimeMillis {
        runBlocking {
            val scooterPrice = getScooterPrice()
            val ps4Price = getPs4Price()

            val totalPrice = scooterPrice + ps4Price
            println("El precio total es: $totalPrice")
        }
    }
    println("tiempo transcurrido en secuencial: ${secuentialTime/1_000L} segundos")

    //obteniendo el precio del scooter y la play 4 de forma asíncrona
    val asyncTime = measureTimeMillis {
        runBlocking {
            val scooterResult = async { getScooterPrice() }
            val ps4Result = async { getPs4Price() }

            val totalPrice = scooterResult.await() + ps4Result.await()
            println("El precio total es: $totalPrice")
        }
    }
    println("tiempo transcurrido en asíncrono: ${asyncTime/1_000L} segundos")
}

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
