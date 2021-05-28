# Reto 1

## OBJETIVO 

- Traducir una clase Java en Kotlin
- Heredar de una clase Java

## REQUISITOS 

1. Haber terminado el [Ejemplo 1](../Ejemplo-01)

## DESARROLLO

1. Copiar el código de la clase Java *User* dentro de un archivo kotlin llamado User (vacío). Discutir lo que sucede.

2. Tenemos esta clase Abstracta ***Product*** en Java. 

    ```java
    public abstract class Product {

        float price;
        String name;
        String sku;


        public Product(float price, String name, String sku ) {
            this.price = price;
            this.name = name;
            this.sku = sku;
        }

        public abstract float getTotalPrice(int quantity);
    }
    ```


    Crear una clase en Kotlin llamado SmartWatch que herede de Product y que devuelva el precio total con base en el precio y la cantidad a comprar (recibido como argumento en el método).

    <details>
        <summary>Solución</summary>

    ```kotlin
    class SmartWatch(
        price: Float,
        name: String,
        sku: String) : Product( price, name, sku) {
        override fun getTotalPrice(quantity: Int): Float {
            return quantity*price
        }
    }
    ```
    </details>

    </br>

3. Desde el *main*, crear un nuevo smartwatch y obtener el precio de 2 de estos relojes.

    <details>
        <summary>Solución</summary>

    ```kotlin
    val appleWatch =
        SmartWatch(
            7000F,
            "Apple Watch",
            "S36-292"
        )

    println(appleWatch.getTotalPrice(2))
    ```
    </details>



</br>

[Siguiente](../Ejemplo-02)