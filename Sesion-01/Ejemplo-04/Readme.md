## Operadores

### OBJETIVO

- Diseñar algoritmos que impliquen operaciones.
- Representar operaciones por medio de variables y operadores.

#### REQUISITOS

1. Conocer aritmética básica :innocent:
2. Tener una breve idea de álgebra booleana.

#### DESARROLLO

Veremos a continuación diferentes tipos de operadores para realizar operaciones aritméticas, comparaciones, etc.

Como se mencionó anteriormente, todas las variables en kotlin son objetos. Por eso, tendremos accesos a métodos especiales dependiendo de su tipo de dato.
Abordaremos entonces las operaciones y sus equivalentes en método.

##### Aritméticos binarios

Expresión | Método
----------|--------
a + b | a.plus(b)
a - b | a.minus(b)
a * b | a.times(b)
a / b | a.div(b)
a % b | a.rem(b)
a..b | a.rangeTo(b)


se utilizan así:

```kotlin
    val a = 10
    val b = 5

    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)
    println(a..b)

```

El resultado esperado es: 

>10

>5

>50

>2

>0

>10..5

El código equivalente con métodos sería así:

```kotlin
    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))
    println(a.rangeTo(b))
```

y debe arrojar el mismo resultado.


### Incrementales / Decrementales

Expresion | Funcion
----------|--------
a++ | a.inc()
a-- | a.dec()

> Incrementan un ***var*** o decrementar en 1 el valor de nuestra variable,
```kotlin
	var c = 23
    c++
    println(c)
    c--
    println(c)
```





##### Asignaciones aumentadas


Expresion | Método
----------|--------
a += b | a.plusAssign(b)
a -= b | a.minusAssign(b)
a *= b | a.timesAssign(b)
a /= b | a.divAssign(b)
a %= b | a.remAssign(b)

Asigna a la variable el valor que resulta de la operacicón de su valor anterior con otra variable.  La operación se determina con el símbolo anterior al ***=***. Por ejemplo
 
> *a += b*  equivale a  *a = a +b*

para demostrar estas operaciones, imprimiremos:

```kotlin
var d = 3

    d+=b // d = 3+5  = 8
    println(d)
    d-=b // d = 8 - 5 = 3
    println(d)
    d*=b // d = 3 * 5 = 15
    println(d)
    d/=b // d = 15 / 5 = 3
    println(d)
}
```

Los resultados sdeben ser: 

>8

>3

>15

>3

###### Operadores de igualdad

El resultado de una operación de igualdad devuelve un booleano, indicadando la vericidad de la expresión.


Expresion | Método
----------|--------
a == b | a.equals(b)
a != b | !a.equals(b)

Ejemplificamos su utilización en kotlin: 

```kotlin
    val e=5
    println("a es igual a b? ${a==b}")
    println("e es igual a b? ${e.equals(b)}")
    println("d es distinto de a? ${d != a}")
```

>a es igual a b? false

>e es igual a b? true

>d es distinto de a? true

##### Operaciones relacionales

El resultado devuelve un booleano, indicando la veracidad de la comparación.

Expresion | Método
----------|--------
a > b | a.compareTo(b) > 0
a < b | a.compareTo(b) < 0
a >= b | a.compareTo(b) >= 0
a <= b | a.compareTo(b) <= 0

Ejemplificamos mediante el siguiente código: 

```kotlin
println(a > b) // 10 > 5 es cierto
println(a < d) // 10 < 3 es flaso
println(e >= b) // 5 <= 5 es correcto
println( c <= e)  // 23 <= 5 es falso
```







