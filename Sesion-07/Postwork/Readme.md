## Postwork

### OBJETIVO
- Evitar crashes en nuestra aplicación
- Manejar de forma estratégica los errores 

#### REQUISITOS

1. Terminar los ejercicios y retos de esta sesión.

#### DESARROLLO

La implementación de manejadores de errores es una tarea importante para el funcionamiento en el desarrollo de software. Existen muchos tipos de errores, pero a continuación enlistamos algunos casos y ejemplos para que los tomes en cuenta durante el desarrollo de tu proyecto. Ya hemos tocado algunas comunes como **ArrayIndexOutOfBoundsException**  cuando queremos acceder a una posición inexistente en un arreglo, **ArithmeticException** cuando se divide entre cero o **NumberFormatException** al querer convertir una String inválida a número.

- FileNotFoundException: Un tipo de IOException que sucede al no encontrar el archivo a leer con la ruta proporcionada. Ejemplo:

```kotlin
val fileStr = File("Archivo").inputStream().readBytes().toString(Charsets.UTF_8)
```

Como el archivo *Archivo* no existe, el sistema nos arrojará la siguiente excepción:

```kotlin
Exception in thread "main" java.io.FileNotFoundException: Archivo (No such file or directory)
```

- ParseException: Al momento de crear un objeto basado en una String con un formato específico, podríamos provocar una excepción si el formato de la string ingresada es inválida:

```kotlin
    val formatData = SimpleDateFormat("MM, dd, yyyy").parse("fecha-invalida")
```

arroja el siguiente error:

```kotlin
Exception in thread "main" java.text.ParseException: Unparseable date: "fecha-invalida"
```

- IllegalArgumentException: Sucede cuando enviamos un argumento inválido a un método. Por ejemplo, si queremos pausar 1 segundo el hilo principal ejecutamos:

```kotlin
    println("hola")
    Thread.sleep(1_000)
    println("adios")
```
pero si utilizamos un número negativo en el Thread, nos arrojará esta excepción porque el tiempo no puede ser negativo (no querrás viajar al pasado, doc).

```kotlin
    Thread.sleep(-1_000)
```

el error sería el siguiente:

```kotlin
Exception in thread "main" java.lang.IllegalArgumentException: timeout value is negative
```


**Nota:** Algunos de las excepciones podrían estar relacionadas con el siguiente tema, por tanto, tomar en cuenta la injerencia en esta [Sesión 8](../../Sesion-08)
