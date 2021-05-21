fun main(){

    val obj = "Hola"

    if (obj !is String) { // same as !(obj is String)
        println("Not a String")
    }


    imprimirNumerico(20)
    imprimirNumerico("asereje")
    imprimirNumerico(intArrayOf(2,4,6))

    val obj2: Any? = null
    //val str: String = obj2 as String //Provoca error por ser unsafe cast

    val str: String? = obj2 as? String
    println(str)

}

fun imprimirNumerico(x: Any) {
    when (x) {
        is Int -> println(x + 1)
        is String -> println(x.length + 1)
        is IntArray -> println(x.sum())
    }
}