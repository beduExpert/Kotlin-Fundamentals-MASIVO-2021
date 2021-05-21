## Postwork

### OBJETIVO

- Implementar abstracciones de clases a nuestro proyecto para organizar mejor 
- Utilizar los Data Class para almacenar datos 

#### REQUISITOS

1. Saber definir los conceptos polimorfismo, herencia y encapsulamiento.
2. Aplicar los conceptos anteriores.
3. Terminar los ejercicios de la [Sesión](../Sesión-04)

#### DESARROLLO

La herencia es un tema fundamental en la Programación orientada a objetos, ya que permite mantener un orden y control sobre la relación de clases emparentadas. Por ejemplo, en el [Postwork de la sesión previa](../Sesión-03/Postwork) ejemplificábamos con una tienda de celulares en línea, el problema es que esta tienda se limita a este producto, y para poder vender productos en general, tendríamos que abarcar más objetos; pero como el concepto producto es muy abstracto, es muy general. Tenemos qué crearle una clase abstracta.

```kotlin
abstract class Product(
    val name: String,
    val description: String,
    var sku:Int){

    abstract fun editProduct()

}
```

definimos una función abstracta por si queremos editar algún detalle de nuestro produccto.

Mobile tiene que extender de él:

```kotlin
class Mobile(
    private val brand: String,
    private val model:String,
    description: String,
    private val color: String,
    private val price: Float,
    sku:Int): Product(model,description,sku)
{

    init {
        println("El celular es un $model de la marca $brand")
    }

    override fun editProduct() {
       println("product edited!") 
    }

}
```

La idea es buscar cuál es el punto más general de los objetos que vas a definir mediante clases, para identificar si existe una abstracción sobre ellos y poder crear una clase raíz abstracta. Si existen características en algunos de los hijos o en otras classes no emparentadas, se utilizan las intefaces. En el caso anterior, podríamos utilizar una interfaz para definir las clases que apliquen a devolución (pues no serán todos), o si algunos de los productos aplican a un descuento.


Otro de los puntos, es utilizar con mayor frecuencia los data class, que por medio de serializador, convierten datos de una API remota en formato JSON a objetos.

Podríamos usar un data class para un historial de transacciones en una aplicación como Uber. La transacción puede tener información de fecha, hora y localización tanto de salida como de llegada, nombre de conductor, precio final. Podríamos también anidar dos data class para la información de localización-tiempo.

```kotlin
data class viaje(
  val initTimeLocation: TimeLocation,
  val endTimesLocation: TimeLocation,
  val price: Double,
  val chauffeur: String,
  val idViaje: Int
)

data class TimeLocation
    (val timestamp: Long,
     val lat: Double,
     val long: Double)
```

