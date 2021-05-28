## Reto 2

### OBJETIVO 

- Practicar código básico Java para comprenderlo al encontrar recursos en este lenguaje
- Utilizar los recursos estáticos de las clases Java

#### REQUISITOS 

1. Haber terminado el [Ejemplo 2](../Ejemplo-02)

#### DESARROLLO

1. Crear una clase ***SmartPhone*** en Java que contenga los siguientes campos:

	precio
	nombre
	modelo
	procesador

Y los siguientes métodos:
	getPrice()
	getName()
	getModel()
	
<details>
	<summary>Solución</summary>
	
```java
public class SmartPhone {

    private float price;
    private String name;
    private String model;
    private String processor;


    public SmartPhone(float price,String name, String model, String processor){
        this.price = price;
        this.name = name;
        this.model = model;
        this.processor = processor;
    }

    public float getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
}
```
</details>
	
2. Crear una variable estática pública en la clase ***stock***, que guarde el número de variables disponibles. Agregar el método estático ***restock()*** para agregar más teléfonos (se suma lo anterior con lo nuevo ingresado) y otro método estático para restarle 
un elemento al stock. Agregar un getter estático para stock.

<details>
	<summary>Solución</summary>
	
```java
    protected static int stock = 0;

    public static void restock(int newStock){
        stock += newStock;
    }

    public static void minusStock(){
        stock--;
    }

    public static int getStock(){
        return stock;
    }
```
</details>


3. Crea una nueva instancia de la clase smartPhone e imprime su precio.


<details>
	<summary>Solución</summary>
	
```kotlin
val iPhone = SmartPhone(
        21230.53F,
        "iPhone",
        "11 Pro",
        "A13 Bionic"
    )

    println(iPhone.price)
```
</details>



4. Hacer un restock de 10 elementos, remover dos smartphones del stock, imprimir el stock, resurtir 5 elementos y volver imprimir el stock.

<details>
	<summary>Solución</summary>
	
```kotlin
    SmartPhone.restock(10)
    SmartPhone.minusStock()
    SmartPhone.minusStock()
    println("Stock actual: ${SmartPhone.getStock()}")
    SmartPhone.restock(5)
    println("Stock actual: ${SmartPhone.getStock()}")
```
</details>


