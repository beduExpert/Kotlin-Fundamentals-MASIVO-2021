# Ejemplo 02 - Clases Kotlin en Java

## OBJETIVO

- Demostrar la capacidad de interoperabilidad entre clases Kotlin para Java
- Experimentar las limitaciones de la comunicación entre estos

## REQUISITOS

1. (Opcional) Tener una ligera noción de Java

## DESARROLLO

En el [Ejemplo anterior](../Ejemplo-01) vimos como una clase Java puede ser utilizada sin ningún problema en Kotlin. Ahora lo haremos al reves.

Vamos a crear la clase ***User*** en Kotlin, y vamos a crear únicamente su constructor, por lo que no implementaremos ningún método ni propiedades adicionales:

```kotlin
class User(
        var name: String,
        var lastName: String,
        var age: Int,
        var status: String,
        var isMale: Boolean
)
```

Ahora creamos una clase *Main* para Java. Dentro de ella situaremos el método estático *main* para ejecutar nuestro código:

```java
public class Main{

    public static void main(String args[]){
    ...
    }
}
```
Ahí generaremos la instancia de nuestra clase:

```kotlin
User user = new User(
        "Daniel",
        "Bedu",
        38,
        "Divorciado",
        true
);
```

Y comprobamos que, para cada propiedad, tenemos un getter y un setter en Java:

```kotlin
// usamos la propiedad name
System.out.println(user.getName());
user.setName("Ian");
System.out.println(user.getName()); //Comprobamos que name haya cambiado


System.out.println(user.getLastName());
user.setLastName("Bedu.org");
System.out.println(user.getLastName()); //Comprobamos que lastName haya cambiado


System.out.println(user.getAge());
user.setAge(21);
System.out.println(user.getAge()); //Comprobamos que age haya cambiado

System.out.println(user.getStatus());
user.setStatus("Soltero");
System.out.println(user.getStatus()); //Comprobamos que status haya cambiado

System.out.println("usuario es hombre? " + user.isMale());
user.setMale(false);
System.out.println("usuario es hombre? " + user.isMale()); //Comprobamos que status haya cambiado
```

Podremos comprobar que agregando el modificador *data* a nuestra clase en kotlin, el código sigue funcionando.


</br>

[Siguiente](../Ejemplo-03)