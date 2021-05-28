# Ej. 02 - Condicionales

## OBJETIVO

- Decidir la ejecución de acciones en función de un evento o estado

## REQUISITOS

1. Tener una noción de sentencias de control en programación

## DESARROLLO

Aprenderemos a decidir qué hacer según el valor de una variable

### Operador if

El operador ***if*** funciona a través de un valor Booleano como parámetro: sólo si recibe true, se ejecuta la sentencia.

```kotlin
if(true){
    println("Siempre se ejecutará esta sentencia")
}

if(false){
    println("Esta linea nunca se va a ejecutar")
}
```

Y en efecto, al ejecutar el código anterior, se imprime:

> Siempre se ejecutará esta sentencia

Vamos a crear una función que nos diga si somos mayores de edad, utilizaremos la función *readLine()* para obtener la edad tecleándola en consola (ignorar el símbolo ? por ahora), con la función *toInt()* hacemos el parseo de *String* a *Int* :


```kotlin
fun verifyAge(){
    print("Ingresa edad y presiona enter (escribe sólo el número): ")
    val age = readLine()?.toInt()

    if(age == 18){
        println("Ya eres mayor de edad!")
    } 
}
```

y lo corremos en el main. Ingresa 18, en consola debe salir:

> Ya eres mayor de edad!

ahora, reemplazaremos el operador *==* por la función ***equals(18)*** , por ahora ignorar los símbolos *?* y *!!* 
```kotlin
if(age?.equals(18)!!){
    println("Ya eres mayor de edad!")
}
```

Ahora teclea 19 o más, ¿Qué sucede? el resultado no se imprime porque sólo cuando tienes 18 saldrá el mensaje, pero la condición es que 
si tenemos 18 o más nos debe mostrar el mensaje. Cambiaremos por tanto el operador *==* por mayor o igual **>=**

```kotlin
if(age!! >=18){
    println("Ya eres mayor de edad!")
}
```

Perfecto! ahora escribe un valor de 18 en adelante para validar que se reciba el mensaje. ¿Qué pasa si ingresas un número menor?
Simplemente no aparece nada. Debemos recibir un mensaje que diga que somos menores de edad, aquí entra la sentencia ***else***, encargado de ejecutar código si la sentencia anterior no se cumple.

```kotlin
if(age!! >=18){
    println("Ya eres mayor de edad!")
} else{
    println("Eres menor de edad!")
}
```

Por último, vamos a hacer una diferencia entre tener la mayoría de edad y acabarla de cumplir; para esto la sentencia de arriba cambiaría a *mayor que*, además de tener que agregarle a la condicional el caso donde tengas 18 años exactamente, ahí utilizaremos el operador ***else if*** :

```kotlin
if(age!! >18){
    println("Ya eres mayor de edad!")
} else if(age!! == 18){
    println("Acabas de cumplir la mayoría de edad")
} else{
    println("Eres menor de edad!")
}
```

### Operador When

Es una expresión ques sirve para ejecutar código según el caso que se cumpla en torno a una variable. Sustituye a *Switch* de los lenguajes C-Like.

Ejemplo:

```kotlin
when (x) {
    1 -> print("x == 1") //se reproducce cuando x vale 1
    2 -> print("x == 2") //se reproduce cuando x vale 2
    else -> { // cualquier otro valor, NOTA: si lo que se va a ejecutar lleva más de una línea de código, se encierra entre llaves 
        print("x is neither 1 nor 2")
    }
}
```

Vamos a crear una función que determine tu escolaridad dependiendo tu edad.

Si tienes 0 años, acabas de nacer, y si tienes un años, sigues siendo muy pequeño, por eso hay que especificarlo:

```kotlin
fun gradoEscolar(){
    print("Ingresa edad y presiona enter (escribe sólo el número): ")
    val age = readLine()?.toInt()

    when(age) {
        0 -> println("A penas eres recién nacido!")
        1 -> println("Sólo tienes un año de edad")
    }

}
```

y lo reproducimos en el *main* :

```kotlin
gradoEscolar()
```

nos pedirá la edad e ingresamos 0, debe salir 

>A penas eres recién nacido!

Ahora ingresamos 1: 

> Sólo tienes un año de edad

Ahora tenemos qué agregar el periodo preescolar, que en nuestro caso irá de los 2 a 5 años, es decir:

```kotlin
in 2..5 -> println("Estás en preescolar")
```

Donde el operador ***in*** verifica que un elemento esté dentro de una colección, y ***..*** genera la colección de números del 2 al 5 para este caso. Usando esta lógica, determinamos nuestros rangos:

*2-5 años: Preescolar
*6-11 años: Primaria
*12-14 años: Secundaria
*15-17: Bachiller
*18-25 años: Universidad (uno nunca sabe :thinking:)

utilizando la línea anterior, el código queda así:

```kotlin
 when(age) {
    0 -> println("A penas eres recién nacido!")
    1 -> println("Sólo tienes un año de edad")
    in 2..5 -> println("Estás en preescolar")
    in 6..11 -> println("Estás en la primaria")
    in 12..14 -> println("Estás en secundaria")
    in 15..17 -> println("Estás en bachillerato")
    in 18..25 -> println("Estás en la universidad")
}
```

Prueba con varias edades para validar, y al final con 26 años. ¿Qué sucedió? debemos determinar un mensaje para cuando no entre en ninguno de estos casos:

```kotlin
else -> {
    println("Edad inválida")
    println("Vuelve a correr el código")
}
```

Ponemos dos *println* para ejemplificar el uso de las llaves (podríamos usar un Raw String único para la función)


Probamos nuevamente con 26, tiene que imprimir lo siguiente:

> Edad inválida

> Vuelve a correr el código





</br>

[Siguiente](../Reto-02)
