fun main(){

    val text: String = "String no nullable"

    var nullableText: String? = "Este texto podría ser nulo"
    nullableText = null

    println(nullableText)

    // generara un error de sintaxis porque el valor puede ser nulo
    //println(nullableText.length)

    // Comprobación por medio de condicional if
    if (nullableText != null && nullableText.length > 0) {
        println("nullableText tiene ${nullableText.length} caracteres.")
    } else {
        println("nullableText esta vacio")
    }

    val nullableText2: String? = null
    println(nullableText2?.length)


    val nullableText3: String? = null
    val resultadoSinElvis = if (nullableText3 != null) nullableText3 else "Texto vacío"

    println(resultadoSinElvis)


    val resultadoConElvis = nullableText ?: "Texto vacío"
    println(resultadoConElvis)


}