val nombres = listOf(
    "Pedro Luis",
    "Juan Manuel",
    "Juan Luis",
    "María Inés",
    "Romeo",
    "Ernesto",
    "Juan Pedro",
    "Ariadna",
    "Mireya María",
    "Ana Sofía",
    "José Juan"
)

fun main(){

    val nameCount = countName("Pefds")
    println("Tu nombre se encontró $nameCount veces")

    var x = 20
    var y = 20

    while(x>0){
        x--
        println(x)
    }

    do{
        y--
        println(y)
    }while (y > 0)

}


fun countName(name: String): Int{
    var count = 0
    for(currentName in nombres){
        if(name in currentName){
            count++
        }
    }
    return count
}