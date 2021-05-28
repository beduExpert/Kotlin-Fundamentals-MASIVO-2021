
# Postwork

## OBJETIVO

- Sintetizar los temas de la [Sesión 2](../../Sesion-02) para aplicarlos al proyecto final

## REQUISITOS

1. Saber utilizar las colecciones básicas de Kotlin
2. Utilizar funciones para separar las tareas de un algoritmo en subtareas específicas
3. Crear bucles que optimicen el código repetitivo
4. Usar condicionales para la toma de decisiones

## DESARROLLO

Esta sesión es un pilar básico no sólo de Kotlin, sino en general de la programación estructurada, pues los temas están presentes en todos los lenguajes modernos. 

### Funciones

Como ya hemos visto anteriormente, utilizar funciones en nuestro algoritmo es una de las claves fundamentales para tener un código óptimo, escalable, legible y modular. En el proyecto, será una práctica constante el generar funciones que ejecuten tareas específicas, como *login*, *pagar*, *registro*, *getProfile*, *showCatalogue*.

```kotlin
//para hacer login si la aplicación lo requiere
fun login(user: String, pass:String): Boolean{
    var loggedIn = false
    ...
    return loggedIn
}

//si tenemos un reproductor de audio, podemos hacer una función para reproducir y otra para pausar 
fun reproducirCancion(cancion: String){
    println("Reproduciendo canción: $cancion")
}

fun pausar(){
    println("Canción pausada")
}

fun pagar(saldo:Double,precio:Double){
    saldo = -precio
    println("Servicio pagado! te restan $saldo pesos")
}

```

Así, cuando tengamos que ejecutar una tarea, en vez de escribir todo el código de la tarea

```kotlin
//en el main llamamos a login
fun main(){
...
    val loggedIn = false
    ... //todo el código de validación
}
```

Ponemos como tal la función

```kotlin
fun main(){
...
    val resultado = login(usuario,contraseña)
}
```


### Condicionales

Tendremos qué tomar decisiones constantemente, por eso debemos implementar condicionales. En el ejemplo del login, debemos comparar si el usuario y la contraseña son correctos para un usuario.

```kotlin
fun login(user: String, pass:String): Boolean{
    if(email=="kotlin@bedu.org" && password=="Kotlindesarrollo"){
        println("Inicio de sesión exitoso")
        return true
    } else{
        println("email o contraseña incorrecto")
        return false
    }
}
```

Si vamos a comprar un artículo, debemos verificar que tengamos saldo suficiente

```kotlin
fun pagar(saldo:Double,precio:Double){
    if(saldo>=precio){
        saldo-=precio
        println("Artículo comprado, saldo restante: $saldo pesos")
    } else{
        println("Necesitas saldo suficiente para poder comprar este producto")
    }
}
```

Al elegir país en una aplicación de productos, podemos utilizar *when* para verificar que el servicio exista en esa región.

```kotlin
fun elegirPais(country:String){
    when(country){
        "México" ->{
            val idioma = "Español"
            val divisa = "Peso"
            actualizarPerfil(pais)
            println("Bienvenido a Bedu shop")
        }
        "Francia" -> {
            val idioma = "Francés"
            val divisa = "Euro"
            val credito = convertirAEuros(saldo) 
            println("Soyez Bienvenu à Bedu shop")
        }
        "Estados Unidos" -> {
            val idioma = "Inglés"
            val divisa = "Dolar"
            val credito = convertirADolares(saldo)
            println("Welcome to Bedu shop")
        }
        else ->{
            println("Lo sentimos, este servicio no está disponible en tu país")
        }
        
    }
}
```


### Colecciones

Este tipo de datos almacenan varios datos en una sola variable, esto podría sernos útil para guardar simulaciones de datos como una lista de canciones disponibles, un catálogo de películas, un inventario de artículos en venta o una especie de base de datos de usuarios.

Para una lista de usuarios, podríamos utilizar Map, puesto que requerimos asociar cuentas con contraseñas. Podríamos reemplazar el dato en duro de la función login por la validación con 

```kotlin
val usuarios = mapOf(
    "kotlin@bedu.org" to "Kotlindesarrollo",
    "daniel@cliente.com" to "Cliente123",
    "Fernando@empresa.mx" to "F3R2472"
);
```

Si queremos almacenar una lista de películas, podemos hacerlas con un Set, si buscamos evitar que estas estén repetidas
```kotlin
val peliculas = setOf(
    "Scary movie",
    "Scary movie 2",
    "Las trillizas de Belleville",
    "Midori",
    "Doce monos",
    "Blade runner",
    "Mulán"
)
```


### Bucles

Constantemente nos encontraremos con tareas repetitivas, a veces sabremos cuántas veces vamos a repetir el proceso y otras, serán hasta que alguna condición se cumpla. En una aplicación de un cine, podemos consultar la cartelera así:

```kotlin
fun cartelera(){
    for(pelicula in peliculas){
        println(pelicula)
    }
}
```

o su equivalente

```kotlin
fun cartelera(){
    peliculas.forEach{
        println(it)
    }
}
```




</br>

[Regresar](../)

