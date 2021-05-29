# Ej. 02 - Inline functions

## OBJETIVO

- Aplicar el keyword inline para depurar espacio en memoria cuando se cree una función de orden superior

## REQUISITOS

1. Crear funciones que reciban funciones como parámetros


## DESARROLLO

En el [Ejemplo 1](../Ejemplo-01) utilizamos lambdas y high order functions (HFO) para realizar distintas operaciones dependiendo de lo que se requiriera. las funciones de orden superior son un gran agente para la programación funcional porque controla el flujo de datos a traves funciones, recibiendo la indicada según sea el caso. Uno de los problemas que nos representa su uso, es que en términos de lenguaje Java, dicha función se vuelve un objeto, y se crea una instancia de este aunque la función no se haya invocado; esto gasta espacio en memoria que puede traducirse en realentización de tu aplicación. 

Si creamos esta función de orden superior
```kotlin
fun nonInlined(runLambda: () -> Unit) {
    println("Antes de correr la función recibida")
    runLambda()
    println("después de correr la función recibida")
}
```

Al meternos en el bytecode, podemos leer algo similar a esto (simplificado para mejor entendimiento.)

```java
public void nonInlined(Function runLambda()) {
    System.out.println("Antes de correr la función recibida");
    runLambda.invoke();
    System.out.println("Después de correr la función recibida");
}
```

Pero al implementar el HOF pasándole una lambda

```kotlin
nonInlined {
    println("Llamando a la función noninlined")
}
```

Se crea un nuevo objeto de acuerdo al bytecode:

```java
nonInlined(new Function() {
    @Override
    public void invoke() {
        System.out.println("Llamando a la función noninlined");
    }
});
```


Java también crea un objeto Function para guardar la función 

```kotlin
nonInlined(new Function() { //este new Function es la instancia que consume espacio innecesario en memoria
    @Override
    public void invoke() {
        System.out.println("do something here");
    }
});
```

Es por esto que es recomendable utilizar el keyword *inline*. Con esto, lo que se hace es que, en vez de crear una clase para nuestra función e invocarla cuando se mande a llamar, el código dentro del inline function se copia y pega en cada implementación del high order function, dando como desventaja el agrandamiento del código.


```kotlin
inline fun inlined(runLambda(): () -> Unit) {
    println("Antes de correr la función recibida")
    runLambda()
    println("después de correr la función recibida")
}

```
Al llamarlo de esta forma:

```kotlin
inlined {
    println("Llamando a la función inlined")
}
```

Observamos aquí que en vez de crearse una instancia, se copió y pegó el código en el inline con la lambda incluída

```kotlin
System.out.println("before");
System.out.println("do something here");
System.out.println("after");
```

En caso de requerir que algún parámetro no se someta a inline, debemos usar el keywordd ***noninline*** en él:

```kotlin
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) { ... }
```

***NOTAS***

* No utilizarlos en HOF muy grandes, ya que este alargaría más el bytecode por cada implementación del inline function.
* Utilizarlos en funciones que no reciban funciones como parámetros no tiene ninguna ventaja.


</br>

[Siguiente](../Ejemplo-03)