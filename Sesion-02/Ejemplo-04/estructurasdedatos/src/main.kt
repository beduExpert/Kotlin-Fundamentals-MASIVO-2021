fun main(){

    //LISTAS
    val numbers = listOf("one", "two", "three", "four", "five")

    //imprimiendo una lista
    println(numbers)

    println("Numero de elementos: ${numbers.size}")
    println("Segundo elemento: ${numbers.get(1)}")
    println("Cuarto elemento: ${numbers[3]}")
    println("Ultimo elemeto: ${numbers.get(numbers.size - 1)}")
    println("Index del elemento \"four\": ${numbers.indexOf("four")}")

    //MUTABLE LISTS
    val mutableNumbers = mutableListOf(1, 2, 3, 4)
    //Abrebar nuevos elementos
     mutableNumbers.add(5)
    //Remover elementos
    mutableNumbers.removeAt(1)
    //Modificar elementos
    mutableNumbers[0] = 0

    println(mutableNumbers)


    //SETS
    val numSet: Set<Int> = setOf(0, 1, 2, 3, 4, 5)
    val reverseNumSet: Set<Int> = setOf(5, 4, 3, 2, 1, 0)

    //MUTABLE SET
    var names: Set<String> = mutableSetOf("Nombre 1", "Nombre 2")


    //MAP
    val namesToAges: Map<String, Int> = mapOf("Usuario 1" to 20, "Usuario 2" to 23)
    println(namesToAges)

    //Imprimir un elemento de map uno por uno por ciclo for
    for ((key, value) in namesToAges) {
        println("$key tiene $value años")
    }

}