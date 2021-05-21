## Getters, Setters y modificadores de acceso

### OBJETIVO 

- Implementar modificadores de acceso de acuerdo a lo que se requiera
- Definir cómo se puede leer y modificar un dato
- Ejecutar acciones adiciconales al leer o modificar un valor de algún atributo

#### REQUISITOS 

1. Haber terminado el [Ejemplo 3](../Ejemplo-03)

#### DESARROLLO

1. Crear un atributo Booleano que nos permita saber si aún seguimos vivos, la variable debe ser únicamente de lectura. Utilizaremos ese valor para elegir si colisionar con un Goomba en el ciclo for.

<details>
	<summary>Respuesta</summary>
	
crear la variable junto con su getter

```kotlin
  val isAlive: Boolean
    get() {
        return lives>=1
    }
```

en el ciclo for de *main.kt*, condicionar la colisión al siguiente *if*:

```kotlin
 if(mario.isAlive){
            mario.collision("Goomba")
            println("Te quedan ${mario.getLives()}")
        }
```

</details>

2. Añadiremos la capacidad de colisionar con una estrella, cuando esto pase, debemos cambiar el estado de Mario por 10 segundos a star y luego regresarlo a su estado anterior. Sin ahondar en el tema, propocionamos un código para esperar 10 segundos para ejecutar código:

```kotlin
import java.util.*
import kotlin.concurrent.schedule


...

    Timer("SettingUp", false).schedule(10000) {
        //Escribe el código a ejecutar 
    }

```

Crear el caso de la estrella en el colisionador, crear el setter y reproducir la función en *main.kt*

<details>
	<summary>Solución</summary>
	
En el colisionador: 	

```kotlin
"Star" -> state = "Star"
```
	
el setter será el siguiente:

```kotlin
set(value) {
        val before = field
        field = value
        println("tu estado ahora es $field")
        if(value=="Star"){
            Timer("SettingUp", false).schedule(10000) {
                field = before
                println("tu estado ahora es $field")
            }
        }
        field = value
    }
```

Ahora hacemos colisionar a Mario con una estrella:

```kotlin
mario.collision("Star")
```

</details>
