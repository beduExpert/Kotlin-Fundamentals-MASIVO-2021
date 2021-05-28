# Reto 02 - Clases abstractas e interfaces

## OBJETIVO 
- Heredar de clases abstractas.
- Implementar interfaces para impulsar a que una funcionalidad sea declarada.

## REQUISITOS 

- Haber cursado el [Ejemplo 2](Ejemplo-02)

## DESARROLLO

1. Crear la clase International para viajes internacionales, contemplar que ahora el usuario proporciona el nombre del País y la Ciudadd

    <details>
        <summary>Solución</summary>

    La clase con los métodos implementados de Travel quedarían así: 

    ```kotlin
    class International(override val country: String, override val city: String) : Travel() {
        override fun quotePrice(numDays: Int) {

        }

        override fun getPrice(numDays: Int): Int {
        }
    }
    ```

    </details>

    </br>

2. Existe un miembro en la clase **Travel** que a pesar de ser abstracta, podría ser idéntica tanto en *National* como en *International*, ¿Cuál es? descúbrela, agrega el cuerpo en la clase abstracta y elimínala de sus hijos.


    <details>
        <summary>Solución</summary>

    El método para cotizar implementado en National, se puede usar también en International, por lo tanto sustituir el método abstracto de **Travel** por:

    ```kotlin
    fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if(price==0){ //si no existe tarifa para esa ciudad, notificamos al usuario
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else{
            println("Tu viaje a $city cuesta \$$price") //notificamos el precio al usuario
        }
    }
    ```

    Borrar sus definiciones tanto en **National** como en **International**

    </details>

    </br>

3. Debemos establecer los impuestos por país, y las ciudades a donde viajar:

    * Alemania tiene el 16% del precio total como impuesto y las ciudades disponibles son:
        * Munich, $980 por día
        * Berlín, $820 por día
        * Francfort, $850 por día

    * Chile cobra únicamente el 5% como impuesto y sus ciudades son:
        * Santiago, $643 por día
        * Valparaíso, $721 por día
    * Canadá cobra el 10% de impuesto y las ciudades a visitar son:
        * Vancouver, $620 por día
        * Ottawa, $680 por día
        * Montreal, $600 por día
        
        
    Declaramos estos atributos

    ```kotlin
        private val germanyFees =  mapOf(
            "Munich" to 980,
            "Berlín" to 820,
            "Francfort" to 850
        )

        private val chileFees =  mapOf(
            "Santiago" to 643,
            "Valparaíso" to 721
        )

        private val canadaFees =  mapOf(
            "Vancouver" to 620,
            "Ottawa" to 680,
            "Montreal" to 600
        )

        val taxGermany = 0.16
        val taxChile = 0.5
        val taxCanada = 0.1
    ```

    Redefinir la función *getPrice()* para que se obtenga el precio de un viaje con impuesto incluído. Hacer pruebas.

    <details>
        <summary>Respuesta</summary>

    ```kotlin
    override fun getPrice(numDays: Int): Int {
        when(country){
            "Alemania" ->{
                val fee = germanyFees[city]
                if(fee==null){
                    return 0
                }
                return (fee * numDays * (1 + taxGermany) ).toInt()

            }
            "Chile" ->{
                val fee = chileFees[city]
                if(fee==null){
                    return 0
                }
                return (fee * numDays * (1 + taxChile)).toInt()
            }
            "Canada" ->{
                val fee = canadaFees[city]
                if(fee==null){
                    return 0
                }
                return (fee * numDays * (1 + taxCanada) ).toInt()
            }
            else ->{
                return 0
            }
        }
    }
    ```

    </details> 

    </br>

4. crear una interfaz que permita cancelar viajes. Implementarlo en la clase ***NationalLowSeason***. Hacer pruebas.

    <details>
        <summary>Respuesta</summary>

    Creamos la interfaz 
    ```kotlin
    interface Cancellable {

        fun cancelTravel()

    }
    ```

    La clase nueva sería la siguiente:

    ```kotlin
    class NationalLowSeason(city: String) : National(city),IPromotion,Cancellable {
        override  val discount = 10 //es porcentaje, o sea 10%
        override val typeDiscount = 0 //0 para porcentaje, 1 para cantidad

        override fun getPrice(numDays: Int): Int {
            val amount = super.getPrice(numDays)
            return if (amount == 0) 0 else getDiscountPrice(amount)
        }

        override fun cancelTravel() {
            if(reserved){
                reserved = false
                paidAmount=0
                println("Viaje cancelado exitosamente!")
            } else{
                println("Este viaje aún no ha sido reservado")
            }
        }
    }
    ```

    Se utilizó este código para verificar que la clase estuviera bien implementada

    ```kotlin
        val viajeBajaGdl = NationalLowSeason("Guadalajara")
        viajeBajaGdl.reserve(4)
        viajeBajaGdl.cancelTravel()
        viajeBajaGdl.cancelTravel()
        viajeBajaGdl.reserve(2)
    ```

    Se reservó un viaje y se cancelo dos veces la reserva: la primera cancelación pasó, la segunda no se realizó porque ya no había ningún viaje reservado. Se pudo volver a Reservar con éxito.
        
    </details>


</br>

[Siguiente](../Ejemplo-03)