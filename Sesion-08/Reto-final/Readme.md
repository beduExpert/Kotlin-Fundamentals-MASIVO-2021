# Reto final

## OBJETIVO

- Utilizar operaciones asíncronas en nuestro proyecto
- Simular recuperación de datos o transacciones como compras, reservaciones o login

## REQUISITOS

1. Haber finalizado los tres ejemplos de esta sesión

## DESARROLLO

Las corrutinas son ideales cuando vamos a realizar una operación que tiene una duración indefinida y/o puede tardar mucho y por ende comprometer el rendimiento de nuestra aplicación. Como se mencionaba anteriormente, en ningún momento bloquean el hilo que los corre, implica poco procesamiento su creación y su implementación es relativamente sencilla.

Con un proyecto inicial, podríamos recuperar información de manera local de un archivo o simular comunicación con un servidor y guardar toda la información en una lista o arreglo. 

Como ejemplo, podemos hacer la simulación de una petición http de un usuario mediante un login para obtener los datos de un usuario y poder almacenarlos. Podríamos definir una clase respuesta similar a esta:

```kotlin
data class User(
    val Username: String,
    val token: String,
    val age: Int,
    val gender: String,
    val credit: Long
)
```

Por lo tanto, al tener una respuesta exitosa, recibiríamos un objeto *User*. A la función que se encarga de recuperar la información del usuario le llamaremos *fetchUser* y utilizaremos una interfaz **Callback** que tendrá los métodos en caso de que la respuesta sea exitosa o errónea.

```kotlin
interface Callback {
    fun onSuccess(user: User)
    fun onFailure(exception: Exception)
}
```

estos callbacks se utilizarán en nuestra función ***fetchUser*** . En este caso, simularemos nuestra petición, devolviendo un usuario *hardcodeado* sin validar que el usuario exista, y esperando 3 segundos para simular el tiempo de respuesta, esto abriendo un hilo.

```kotlin
private fun fetchUser(callback: Callback) {
    Thread {
        Thread.sleep(3_000)

        callback.onSuccess(
            User(
            "DanBedu",
            "783-43-E32B-648C",
            32,
            "Female",
            0
        ))
    }.start()
}
```

En este punto podremos utilizar un nuevo concepto de corrutinas: ***suspendCancellableCoroutine***, esta función suspend nos regresa un objeto **CancellableContinuation** que nos permitirá usar dos métodos:

- **resume:** reanuda la corrutina, devolviendo el valor que se pasa en su parámetro.
- **resumeWithException:** reanuda la corrutina, lanzando la excepción correspondiente.

el código de la corrutina es el siguiente:

```kotlin
private suspend fun fetchUserCoroutine(username: String,password:String): User = suspendCancellableCoroutine {
        cancellableContinuation ->
    fetchUser(object : Callback {
        override fun onSuccess(user: User) {
            cancellableContinuation.resume(user)
        }

        override fun onFailure(exception: Exception) {
            cancellableContinuation.resumeWithException(exception)
        }
    })
}
```

Para concluir con el código, abrimos la corrutina con runBlocking y llamamos fetchUserCoroutine con sus parámetros (aunque aquí pedimos usuario y contraseña, no hacemos uso de estos dos parámetros para validarlos).

```kotlin
fun main() = runBlocking {
    try {
        println("Iniciando recuperación de usuario")
        val user = fetchUserCoroutine("DanBedu","K0tlinBedu")
//        updateUser(user)
        println(user)
    } catch (exception: Exception) {
        println("Error: $exception")
    }
}
```

Por supuesto podemos hacer validaciones de usuarios con Maps,Lists, Arrays, etc. y que sea el usuario quien ingrese con teclado las credenciales. De la misma forma, se pueden simular otras transacciones como recibir listas de productos, comprar un producto y actualizar el saldo; obtener una lista de películas y hacer un servicio para calificarlos.





</br>

[Siguiente](../Postwork)