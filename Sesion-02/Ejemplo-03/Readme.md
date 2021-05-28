# Ej. 03 - Ciclos

## OBJETIVO

- Diferenciar entre los tipos de ciclos disponibles y utilizarlos según el caso

## REQUISITOS

1. Tener una noción básica de ciclos en programación

## DESARROLLO

### For

El ciclo **for** itera sobre todos los elementos de cualquier objeto que proveea un *iterator*, que son objetos que pueden regresar secuencialmente sus elementos, heredando de *Iterable<T>*. Las listas son un ejemplo.
	
El ejemplo mas práctico sería imprimir un rango de números del 1 al 5 con esete ciclo:

```kotlin
for (i in 1..5) {
    println(i)
}
```
Regresará los siguientes números:

> 1,2,3,4,5

Para no contar el último valor, utilizaremos esta notación:

```kotlin
for (i in 1 until 5) {
    println(i)
}
```

Regresará los siguientes números:

> 1,2,3,4

podemos elegir el paso entre cada ciclo, para contar de 2 en 2 o en otro número:

```kotlin
for (i in 0..10 step 2) {
        println(i)
    }
```

Regresará los siguientes números:

> 0,2,4,6,8,10


Podemos iterar también sobre una lista:

```kotlin
val nombres = listOf(
    "Kirby",
    "Ness",
    "Fox",
    "Luigi",
    "Mario",
    "Link",
    "Captain Falcon",
    "Samus",
    "Pikachu",
    "Jigglypuff",
    "Donkey Kong",
    "Yoshi"
)

for (nombre in nombres){
    println(nombre)
}
```

los iterators cuentan con un método llamado *foreach* y es equivalente al anterior ciclo for:

```kotlin
nombres.forEach { println(it) }
```

también podemos parar el ciclo cuando decidamos, por ejemplo:

```kotlin
 for (nombre in nombres){
    println(nombre)
    if(nombre=="Link"){
        println("Personaje encontrado!")
        break
    }
}
```

por supuesto el loop se detendrá al encontrar el nombre Link.


### While

Los ciclos while mantienen el ciclo hasta que la condición dentro de él:

```kotlin
var x = 20

while (x > 0) {
   println(x)
    x--
}
```

   


</br>

[Siguiente](../Reto-03)

