# Reto 02 - Constructores

## OBJETIVO 

- Inicializar objetos a través de su constructor

## REQUISITOS 

- Haber finalizado el [Ejemplo 2](../Ejemplo-02)

## DESARROLLO

1. Crearemos una clase Person con datos de constructor: 

    * Nombre
    * Apellidos
    * Sexo
    * Altura

    <details>
        <summary>Solución</summary>

    la clase es la siguiente: 

    ```kotlin
    package ` clases`

    class Person (val name:String,val apellidos: String, val sexo: String,val altura: Float) {

        init {
            println("""
                valor edición: 
                nombre: $name,
                apellidos: $apellidos,
                sexo: $sexo,
                altura: $altura
            """.trimIndent())
        }


    }

    ```

    Para crear una instancia de la clase:

    ```kotlin
    fun main(){

        val person = Person(
            "Daniel",
            "Bedu",
            "Masculino",
            1.78f)

    }
    ```

    </details>

</br>

[Siguiente](../Ejemplo-03)