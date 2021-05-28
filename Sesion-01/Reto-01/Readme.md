# Reto 01 - Primeros pasos

## OBJETIVO 

- Utilizar una alternativa online para testeo rápido.
- Complementar el tema de impresión de pantallas.

## REQUISITOS 

1. Haber cursado el [Ejemplo 1](../Ejemplo-01)

## DESARROLLO

En este ejercicio te vamos a enseñar una herramienta online para correr código kotlin en línea.
Puedes ocupar este sitio para probar algún snippet que obtuviste de stackoverflow para comprobar que te sea útil o si estás en una máquina
donde no tienes instalado IntelliJ IDEA y requieres crear rápidmante un archivo.

Puedes acceder al sitio [haciendo click aquí](https://play.kotlinlang.org)

En esta consola haremos lo siguiente: 

1. Imprimir el mismo mensaje que imprimimos en el [Ejemplo 1](../Ejemplo-01)
2. Abajo de la linea de código de la tarea 1) , poner otro mensaje en consola ¿Qúe pasa con los dos mensajes?
3. ahora utiliza *println* e imprime alguna otra cosa, qué diferencia hay con *print* ?


**BONUS:**
después de correr el código, consultar la url que se generó, tendrás algo así:
[https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS4zLjYxIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsImpzQ29kZSI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS4gXG4gKiBwbGF5LmtvdGxpbmxhbmcub3JnIFxuICovXG5cbmZ1biBtYWluKCkge1xuXG4gICAgcHJpbnRsbihcIkhlbGxvIHdvcmxkXCIpXG59In0=]()

copiar el texto después del primer **#** y pégalo en el campo encoded de [este sitio](https://jwt.io/) y observa el JSON decodificado de la derecha, ¡El campo code es nuestro código! nosotros enviamos el código por un JSON, ellos lo procesan y nos devuelven la información!

</br>

[Siguiente](../Ejemplo-02)