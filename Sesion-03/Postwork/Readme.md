## Postwork

### OBJETIVO

- Diseñar clases con propiedades y métodos que representen correctamente un objeto.
- Abstraer la lógica del proyecto final al paradigma que brinda POO

#### REQUISITOS

1. Haber terminado los ejemplos y retos de esta [Sesión](../)

#### DESARROLLO

Explicaremos un poco cómo la Programación Orientada a Objetos puede adaptarse exitosamente a una aplicación informática.

Debido a la naturaleza de este paradigma, debemos pensar en transformar los elementos de nuestra lógica de negocio y en general, del algoritmo, en objetos. Es por esto, que cuando creamos un registro para una aplicación, lo correcto sería definir una clase que almacene la información de perfil del usuario al crear su cuenta con éxito.

```kotlin
const val PHONE_LENGTH = 10

//los atributos declarados en el constructor son obligatorios desde el principio
//mientras que en los del cuerpo, son opcionales y se acceden al actualizar el perfil.
//No queremos que nadie modifique ningún atributo directamente, por eso todos serán privados
class User(
    private val name: String,
    private var age: Int,
    private val userToken: String,
    private val email: String ){
    
private var phoneNumber: Long = 0

}
```

Con esto tenemos todo el modelo de datos de nuestra información de perfil. Si queremos validar que el número telefónico tenga la longitud adecuada, utilizamos un setter.

```kotlin
...
 private var phoneNumber: Long = 0
        set(value){  //Utilizamos un setter para guardar un valor sólo cuando cumpla con los 10 dígitos de un número telefónico
            if(value.toString().length == PHONE_LENGTH){
                field = value
            } else{
                println("El número que ingresaste es incorrecto")
            }
        }
...
```
Si queremos poder modificar ciertos datos de mi perfil, podemos crear una función que haga el update:

```kotlin
 //Esta función nos permite actualizar los datos modificables de nuestro perfil
    fun updateProfile(phoneNumber: Long, age:Int){
        this.phoneNumber = phoneNumber
        this.age =  age
    }
```

Dejando este ejemplo atrás, si pensamos en una tienda en línea de teléfonos celulares, tenemos que tener una clase que represente dicho producto. un teléfono tiene como características su modelo, marca, color, SKU y precio. 

```kotlin
class Mobile(
    val sku: Int,
    private val brand: String,
    val color: String,
    private val model: String,
    private val price: Float){

    init {
        println("El celular es un $model de la marca $brand")
    }

}
```
Seamos conscientes que vamos a requerir un carrito de compras para guardar los celulares a comparar. Podríamos crear un *List* que guarde todos los objetos *Mobile* que querramos comprar, y al proceder al pago, iterar todos los teléfonos del carrito y sumar los precios. Para esto se requeriría otra clase que represente un método de pago, y que se verifique que se disponga del saldo suficiente para pagar. Lo describiríamos aquí... pero te toca a tí :wink: 

¡Con estos ejemplos podemos hacernos a la idea de cómo ir traduciendo toda entidad a un objeto y así darle forma a nuestro proyecto!






