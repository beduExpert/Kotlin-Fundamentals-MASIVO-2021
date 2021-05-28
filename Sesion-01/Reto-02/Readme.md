# Reto 02 - Variables y tipos de datos

## OBJETIVO 

- Comprobar ciertos tipos de datos asignados por defecto

## REQUISITOS 

1. Haber terminado el [Ejemplo 2](../Ejemplo-02) y [Ejemplo 3](../Ejemplo-03)

## DESARROLLO

Para un número decimal, qué tipo de dato se asigna por defecto? Imprimirlo

<details>

<summary>Respuesta</summary>

El tipo de dato por defecto es Long y lo comprobamos así:

```kotlin
 val decimal = 1.325
    println(decimal.javaClass.kotlin)
```

el resultado debe dar

>class kotlin.Double

</details>

</br>

Volver flotante a la variable *decimal* 

<details>

<summary>Respuesta</summary>

El tipo de dato por defecto es Long y lo comprobamos así:

```kotlin
 val decimal = 1.325f
```

o

```kotlin
 val decimal = 1.325F
```

el resultado debe dar

>class kotlin.Float

</details>

Declarar una variable *const val* con el valor de PI y multiplicarla por 2 veces nuestra variable *decimal* para sacar el perímetro de un círculo

Para multiplicar adelantaremos el uso del operador de multiplicación  * y su uso es así:

```kotlin
 val c= a*b
```


<details>

<summary>Respuesta</summary>

```kotlin
const val PI = 3.1416
fun main() {
    val decimal = 1.325F

    val perimetro = 2*PI*decimal
    
    println(perimetro)

}
```

</details>

para el ejemplo anterior, utilizar un *String Template* para imprimir el texto *El perímetro del círculo es: [resultado]* siendo resultado nuestra variable perímetro



<details>

<summary>Respuesta</summary>

```kotlin
...
fun main() {
...
    
    println("El perímetro del círculo es: $perimetro")

}
```

</details>


</br>

[Siguiente](../Ejemplo-03)
