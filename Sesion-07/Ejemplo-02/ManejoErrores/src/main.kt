import java.lang.Exception
import java.lang.NumberFormatException

fun main(){

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


    val possibleNumber = "bedu.org"
    val a: Int? = try { possibleNumber.toInt() } catch (e: NumberFormatException) { null }

    println("El numero convertido es: $a")
}


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