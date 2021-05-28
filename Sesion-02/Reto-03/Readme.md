# Reto 03 - Ciclos

## OBJETIVO 

- Aplicar ciclos para resolver problemas

## REQUISITOS 

1. Haber finalizado el [Ejemplo 3](../Ejemplo-03)

## DESARROLLO

1. Crear y utilizar una función que regrese el número de veces que se repite un nombre en la siguiente lista de nombres:

    Pedro Luis, Juan Manuel, Juan Luis, María Inés, Romeo, Ernesto, Juan Pedro, Ariadna, Mireya María, Ana Sofía, José Juan

    <details>
        <summary>Solución</summary>
        
    Primeramente declaramos nuestra lista: 

    ```kotlin
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
    ```
        
    inicializamos nuestra variable de conteo, en cada iteración revisamos que el nombre actual contenga el nombre buscado con ***String1 in String 2***
    ```kotlin
    fun countName(name: String): Int{
        var count = 0
        for(currentName in nombres){
            if(name in currentName){
                count++
            }
        }
        return count
    }
    ```

    Obtendremos después el número de veces que se encontró el nombre y lo imprimiremos en pantalla

    ```kotlin
    val nameCount = countName("Juan")
    println("Tu nombre se encontró $nameCount veces")
    ```

    </details>

    </br>

2. El [Ejemplo 3](Ejemplo-03) contenía el siguiente ejemplo de ciclo while:

    ```kotlin
    var x = 20

    while (x > 0) {
    println(x)
        x--
    }
    ```

    existe otra forma de utilizar el ciclo while

    ```kotlin
    do {
    //Código a ejecutar
    } while (condicion)
    ```

    adaptar el código del while a esta nueva forma y describir la diferencia entre las dos.


    <details>
        <summary>Solución</summary>
        
    ```kotlin
    var y = 20
    do{
            y--
            println(y)
        }while (y > 0)
    ```
    La diferencia es que while checa la condición al inicio y do-while al final
        
    </details>


</br>

[Siguiente](../Ejemplo-04)