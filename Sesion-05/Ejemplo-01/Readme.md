
# Ejemplo 01: Funciones literales y Funciones de orden superior

# OBJETIVO

- Declarar variables que contengan funciones 
- Utilizar funciones como parámetros de entrada o salida dentro de otra función

## REQUISITOS

1. Tener conocimiento previo de programación funcional

## DESARROLLO


### Funciones literales

En Kotlin existen algunos tipos de funciones que no son declaradas, sino que son asignadas en forma de expresión: Las funciones literales.

Para ejemplificar su uso, vamos a crear y correr una función literal que imprima un saludo.

>Las sentencias de nuesta función van entre llaves **{}**, los paréntesis indican que se va a ejecutar la función expresada, como haríamos con cualquier función normal. 

```kotlin
	{println("Hola BEDU!")}()
```

Podríamos almacenar esta función dentro de una variable y después ejecutarla:

```kotlin
var saludo = {println("Hola BEDU")}()

//Ejecutamos nuestra funcion lambda
saludo()
```

Las funciones literales se pueden clasificar en dos tipos: 

* Expresiones lambda
* Funciones anónimas


### Expresiones lambda

Las expresiones lambda tienen la siguiente estructura:

val <nombre_lambda>: <Tipo> = {<argumentos> -> <cuerpo>}
	
El tipo en la constante definiría el tipo de función. Si tenemos una función que recibe como parámetro dos enteros y regresa un double, tendríamos que definirla de la siguiente forma:

```kotlin
val f: (Int, Int) -> Double
```

Veamos un ejemplo básico de cómo declarar una lambda almacenada en la variable ***suma***

```kotlin
val suma = {a: Int, b: Int -> a + b}

//Ejecutamos nuestra lambda mandandole dos numeros como parametros
print(suma(4, 5))
```
Si observas, nuestra función recibe dos numeros y con **->** le decimos que va a retornar la suma de los mismos.
¡Genial! no tuvimos qué declarar el tipo de función en nuestra variable suma!

Ahora, vamos a declarar la función ***presentarse()***  de la siguiente forma:

```kotlin
val presentarse = {name,age ->  "Me llamo $name y tengo $age años"}
println(presentarse("Daniel",33))
```
corremos el código y ... ¡Error!

En este caso no tuvimos la suerte de que Kotlin adivinara los tipos de datos ¿Por qué?

Al no declarar el tipo de datos de los parámetros de entrada en la lambda, no puede extrapolar dichos datos para intuir el tipo de función. La solución sería

a) Declarar el tipo de función 
b) Declara los tipos de datos en la lambda

presentamos la primera solución del inciso a):

```kotlin
val presentarse: (String,Int) -> String = {name,age ->  "Me llamo $name y tengo $age años"}
```

nuestra salida es la siguiente:

> Me llamo Daniel y tengo 33 años


Ahora vamos a hacer una función lambda más interesante. Estamos creando una aplicación que nos informa del exceso de nuestros gastos, y clasificamos el grado de ahorro del usuario comparando lo que esperaba ahorrar contra lo ahorrado, si el usuario ahorro 10% más de lo esperado sería "Ahorrador pro", si fue lo esperado, sería "buen ahorrador", si ahorro fue menos de 100 y mayor o igual a 80%, le llamaremos "almost" y si fue menos,a lo llamaremos "aprendiz saver".

```kotlin
val saverGrade: (Double,Double) -> String = { expected: Double, saved: Double ->
	val percentage = saved / expected


	when {
		percentage > 1  -> "Ahorrador pro"
		percentage == 1.0   -> "Buen ahorrador"
		percentage < 1.0 && percentage >= 0.8 -> "Almost"
		else     -> "aprendiz saver"
	}
}

	println(saverGrade(100.0,120.0))
```

**BONUS***
Podemos crear un tipo de lambdas llamadas *receivers*, que nos permiten hacer una extensión de funcionalidad a algún tipo de dato en kotlin, y es muy útil al implementar tareas operativas recurrentes con un tipo de dato en específico. Supongamos que acostumbramos a elevar al cuadrado enteros, por lo cual creamos una lambda ***square()***.


```kotlin
val square: (Int) -> Int = { it * it }
```

para implementarlo en la clase **Int**, asignamos nuestro receiver a un método de la clase que lo convierte en miembro.

```kotlin
val toSquare: Int.() -> Int = square
```

### Funciones anónimas

Las funciones anónimas dan un formato más tradicional a las funciones literales: la sintaxis con la que se crean es la misma que cualquier función convencional, pero removiendo su nombre. Por lo tanto, si queremos que nuestra lambda se vuelva una función anónima, lo hacemos de la siguiente forma: 

```kotlin
val saverGrade2 =  fun(expected:Double, saved:Double): String{
	val percentage = saved / expected

	return when {
		percentage > 1  -> "Ahorrador pro"
		percentage == 1.0   -> "Buen ahorrador"
		percentage < 1.0 && percentage >= 0.8 -> "Almost"
		else     -> "aprendiz saver"
	}
}

println(saverGrade2(100.0,70.0))
```


### Higher-order functions

Kotlin no es un lenguaje de programación basado en programación funcional, pero es bastante flexible con este, ya que cuenta con herramientas que facilitan la aproximación al paradigma. La implementación de los high order functions o funciones de orden superior son prueba de ello.

Las Higher-order functions aparte de recibir variables como parámetros, también pueden recibir **funciones** como parámetros e incluso retornarlas. 

Para declarar una función de orden superior, vamos a usar la notación que ya conocemos, con la diferencia de que dentro de los paréntesis (donde van nuestros parámetros) por una parte van los parámetros y por otra va la función que recibirá nuestra Higher-order function. 

Hay que tomar en cuenta que la función que va como parámetro la vamos a escribir con la notación de lambda. Ojo con lo que sigue, los parámetros "tradicionales" son los que van a entrar a nuestra lambda, ejemplo:
>Función de orden superior que recibe dos numeros enteros y una función lambda que va a sumar esos números:

```
fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int) -> Int {
	return suma(a, b)
}

```
Analizemos el ejemplo de arriba:
>Declaramos una función de orden superior **sumaOrdenSuperior**
```kotlin
fun sumaOrdenSuperior() {

}
```
>Pasamos como parámetros dos variables del tipo Int
```kotlin
fun sumaOrdenSuperior(a: Int, b: Int) {

}
```
>También, como parámetro pasamos una lambda, que va a indicar la estructura del tipo de función que va a recibir 
>nuestra Higher-order function, o sea, esta función de orden superior va a poder recibir cualquier función que 
>cumpla con esa estructura.
```kotlin
	fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int) {

	}
```
Como nuestra función **suma** está retornando un valor entero, entonces nuestra función de orden superior también tendría que hacerlo. Existirán casos en los que no tengan que tener el mismo tipo de retorno, pero eso depende mucho de la solución que tengamos que hacer.
>Colocamos el tipo de retorno de nuestra funcion de orden superior igual al de nuestra función que va como 
>parámetro, y por último retornamos la función suma con los parámetros que recibimos.
```kotlin
	fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int): Int {
		return suma(a, b)
	}
```
Y entonces, ¿para qué nos sirven las funciones de orden superior?. 

Hagamos un ejemplo con un caso real. Supongamos que tenemos que hacer una calculadora, tenemos que hacer suma, resta y multiplicación de dos números. Tendríamos que hacer una función para cada operación, ¿cierto?, lo tenemos que hacer, pero combinando el uso de lambdas y las funciones de orden superior. Podemos hacerlo tan sencillo que al principio lo vas a dudar, veamos el ejemplo:
```kotlin
//Declaramos nuestra funcion de orden superior

fun calculadora(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
	return operacion(a, b)
}

//Funciones inline por cada una de nuestras operaciones

fun suma(a: Int, b: Int) = a + b
fun resta(a: Int, b: Int) = a - b
fun multiplica(a: Int, b: Int) = a * b

//Almacenamos el resultado de cada operacion en una variable

val suma = calculadora(10, 5, ::suma)
val restar = calculadora(10, 5, ::resta)
val multiplicar = calculadora(10, 5, ::multiplicacion)
```
Si observas, estamos reutilizando código para hacer nuestras operaciones, y ya que las tres funciones que declaramos para cada una de nuestras operaciones cumplen con la misma estructura, podemos usarlas de la misma forma con nuestra función de orden superior. Usamos **::** para indicar que los parámetros que lleva nuestra Higher-order function se van a pasar a nuestra función que va como parámetro.

¡No lo olvides! Es importante que siempre vayas a la documentacion oficial de kotlin, donde encontrarás recursos útiles y podrás profundizar en el tema.

Ahora ve al [Reto 01](../Reto-01) y complétalo con lo que acabas de aprender. 
**¡Mucho éxito!**


</br>

[Siguiente](../Reto-01)