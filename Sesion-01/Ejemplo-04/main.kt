fun main() {
    val a = 10
    val b = 5

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))
    println(a.rangeTo(b))


    //incrementales/decrementales
    var c = 23
    c++
    println(c)
    c--
    println(c)

    //asignaciones aumentadas
    var d = 3

    d+=b // d = 3+5  = 8
    println(d)
    d-=b // d = 8 - 5 = 3
    println(d)
    d*=b // d = 3 * 5 = 15
    println(d)
    d/=b // d = 15 / 5 = 3
    println(d)

    //igualdades
    val e=5
    println("a es igual a b? ${a==b}")
    println("e es igual a b? ${e.equals(b)}")
    println("d es distinto de a? ${d != a}")

    println(a > b) // 10 > 5 es cierto
    println(a < d) // 10 < 23 es cierto
    println(e >= b) // 5 <= 5 es correcto
    println( c <= e)  // 23 <= 5 es falso
}
