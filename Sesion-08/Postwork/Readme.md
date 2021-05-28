# Postwork

## OBJETIVO
 
- Utilizar operaciones asíncronas en nuestro proyecto
- Simular recuperación de datos o transacciones como compras, reservaciones o login

## REQUISITOS

1. Haber finalizado los tres ejemplos de esta sesión

## DESARROLLO

En el [Reto final](../Reto-final) ejemplificamos el uso de las corrutinas para simular la recuperación remota de datos, pero las corrutinas pueden servir para bastantes más cosas:

- Crear un flujo asíncrono
- Realizar operaciones al disco de manera segura 
- En general, proceso pesados que puedan bloquear el **Main Thread**


Por lo que cualquiera de estas tareas podría ser simulada en tu proyecto final. Podríamos simular la recuperación de algún dato en memoria o el procesamiento de muchos datos en ciclo. Incluso, podemos agregar a nuestras corrutinas de tener un tiempo límite de ejecución antes de ser interrumpida por el lanzamiento de un error de timeout. El siguiente código ejemplifica la descarga de un archivo, con timeout de 10 segundos.

```kotlin
fun main() = runBlocking {
    withTimeout(10_000L) {
        repeat(30) { i ->
            println("Descargando $i% ...")
            delay(300L)
        }
    }
}
```

Otro ejemplo de aplicación de coroutines podría ser la aplicación de un filtro a una imagen cargada, como no se sabe con certeza el tiempo de ejecución y la operación podría ser pesada, se opta por utilizar una corrutina. Igual podría pasar con alguna operación que requiera analizar una gran cantidad de datos o incluso un algoritmo de visión artificial.

Debido a que en este curso se pretende dar las bases de kotlin y no un desarrollo avanzado, muchas de las aplicaciones a coroutines pueden ser simplemente simulaciones.


</br>

[Regresar](../)