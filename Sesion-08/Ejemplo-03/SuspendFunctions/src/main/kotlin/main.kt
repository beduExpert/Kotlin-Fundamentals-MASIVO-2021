import kotlinx.coroutines.*

fun main() = runBlocking { // this: CoroutineScope
    getInventary(1)

}

suspend fun getInventary(productId:Int){
    println("Buscando producto en el inventario...")
    delay(2000)
    val stock = (0..99).random()
    println("producto identificado, en stock: $stock")

}
