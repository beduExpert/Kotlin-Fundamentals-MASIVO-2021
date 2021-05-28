# Reto final - Inicialización de proyecto 

## OBJETIVO

- Definir el proyecto con el que trabajaremos todo el curso.
- Interpretar los lineamientos que integra el proyecto.
- Programar la idea básica de nuestra aplicación.

## REQUISITOS

1. Abstraer el concepto de ciclos y condicionales
2. Manejar de forma básica el IDE 
3. Aplicar variables y realizar operaciones sobre ellas

## DESARROLLO

### Cómo definir el proyecto

En esta primera parte del curso, debemos definir un proyecto con el que trabajemos las 8 sesiones. Este proyecto va ir tomando mayor complejidad conforme se vaya avanzando en nuevos temas, obteniendo herramientas que nos permitan realizar nuevas funcionalidades.

Para poder elegir el proyecto adecuado, hay que considerar ciertos factores:

* Se basa en una idea de proyecto que ya existe (spotify, amazon,rappi, etc).
* Soluciona un problema de la vida real.
* Se puede plantear como una aplicación móvil.
* Se limita a una simulación sencilla de la prestación de algún servicio o producto.


Algunos de los ejemplos podrían ser una lista de cosas por hacer, una aplicación de compra de productos en línea, un reproductor de audio, un catálogo de películas como IMDb, una agencia de viajes etc.

### lineamientos para comenzar el proyecto

- Aconsejamos no definir una idea muy compleja del proyecto, puesto a que su propósito es meramente didáctico.
- La estructura del código irá tomando forma a lo largo del proyecto.
- Iniciaremos nuestro proyecto creando un archivo main y ahí escribiremos nuestro código.
- Tenemos limitadas herramientas para iniciar, por lo que iniciaremos con tareas sencillas como sumas de cantidades en el caso de una tienda en línea o la simulación de reproduccción de una canción con una impresión de pantalla.


El proyecto será una simulación de alguna funcionalidad, pero no tiene por qué funcionar realmente: Si hacemos un reproductor de audio, podríamos simular la reproducción con un mensaje en consola que diga: "Reproduciendo/pausado".

La línea de código ***println()*** nos será muy útil, pues así sucederá la mayor parte de la simulación, como mostrar el precio de un producto seleccionado al cliente, o imprimir un recibo de compra a un usuario. 

Para ingresar datos desde la consola, se puede utilizar el comando ***readLine()***, que regresa un *String*.  

```kotlin
val input = readLine()
```

Si se requiere un dato de diferente valor, se puede hacer la conversión al tipo de dato que se requiera (con la posibilidad de obtener un error en caso de que el String no sea compatible con el tipo de dato).

```kotlin
val age = readLine()!!.toInt()
```

O se puede obtener instanciando la clase Scanner() y llamando su método next(), next debe llevar en nombre del tipo de dato (i.e. nextBoolean() ).

```kotlin
val reader = Scanner(System.`in`)
var age:Int = reader.nextInt()
```

### Interfaz gráfica

Si un equipo opta por desarrollar una interfaz gráfica mínima para el proyecto, existen algunas librerías que hacen el trabajo. En este curso no se cubrirá este tema y se advierte que desarrollar una, implica inversión extra de tiempo, pero existe libertad para esto. Existe un framework llamado TornadoFX que es una adaptación de JavaX para Kotlin.

https://github.com/edvin/tornadofx 

consulta la documentación para la integración si así se requiere.



</br>

[Siguiente](../Postwork)
