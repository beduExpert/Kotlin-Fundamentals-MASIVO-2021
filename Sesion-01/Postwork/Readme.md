# Postwork

## OBJETIVO

- Sintetizar el contenido de esta sesión y comentar posibles aplicaciones del conocimiento adquirido para implementarlos en el proyecto final.

### REQUISITOS

1. Abstraer el concepto de ciclos y condicionales
2. Manejar de forma básica el IDE 
3. Aplicar variables y realizar operaciones sobre ellas

### DESARROLLO

Está demás decir que ocuparemos bastantes variables en nuestro proyecto para tratar datos. Si creamos una tienda en línea, vamos a requerir guardar el nombre del usuario y la contraseña de nuestro cliente, que son Strings, para identificar la compra. Para un directorio de restaurantes, tendremos qué tener una lista de nombres de restaurantes con su dirección, y el precio promedio de una comida. 

guardando precios en una variable
```kotlin
val productPrice = 200
val productPrice2 = 150

println("El precio del artículo es de $productPrice")
```

conteniendo información de perfil en variables: 

```kotlin
val name = "Daniel"
val enterprise = "Bedu"
val uid = "3624-2332-5480"
val credit = 828.33
val gender = false
val age = 44
```

### Operaciones

Utilizaremos operadores aritméticos para la suma de cantidades para obtener el total a pagar, y quizá una multiplicación para aplicar un impuesto.

```kotlin
val amount = productPrice + productPrice2 // la suma del precio de unos productos
val tax = 1.16f //el porcentaje con impuestos 

val total = amount*tax; //valor total con impuestos sumados
println("El total a pagar es de $total pesos")
```

Podemos validar la edad de un usuario para saber si es apto para acceder al contenido de nuestra aplicación

```kotlin
val isLegal = age>=18
println("El usuario es mayor de edad? $isLegal")
```


</br>

[Regresar](../)


