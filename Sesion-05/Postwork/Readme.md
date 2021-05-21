
## Postwork

### OBJETIVO

- Complementar la información de programación funcional 
- Mostrar un soporte para la implementación de este paradigma en tu proyecto final

#### REQUISITOS

1. Haber terminado todos los ejemplos y retos de esta [Sesión](../)

#### DESARROLLO


Muchas colecciones en Kotlin tienen funciones que implementan programación funcional. Daremos varios ejemplos:


Algunas aproximaciones a programación funcional podrían ser dados los siguientes casos:

- Si tenemos una aplicación para reproducir música por streaming como spotify, podríamos necesitar la opción de reproducir aleatoriamente una lista de canciones, por lo que requeriremos una función pura que nos devuelva la lista de reproducción revuelta o en desorden.

- Podríamos tener una aplicación que ofrezca sevicios, y que para algunos de ellos, requiera que ciertos datos de perfil de usuario estén completados, para esto, podríamos hacer la respectiva validación y dependiendo del resultado, se reproduzca el servicio ofrecido o se ejecute un callback de error. Suponiendo que se requiere tener la dirección de domicilio, el número telefónico, datos de mi vehículo y el RFC para los siguientes servicios: seguro de vehículos, pago de tenencia de vehículos y gasolina: si los datos que tenemos son válidos, el primer servicio podría mostrar en pantalla las diversas opciones de seguros mientras que el pago de tenencia me muestra la suma a pagar y la gasolina me pida la cantidad de litros para generar el pedido, cada una de estas opciones puede ser la función que se pase como argumento en caso de ser exitosa la validación, y enviar otra función adicional en caso de error.

- También son un gran recurso las operaciones funcionales como filter, partition, map etc. Para generar filtros en caso de querer visualizar únicamente películas de cierto genero, o aplicar un descuento temporal a ciertos productos con la función map, etc.

#### Recursos adicionales
Estos videos de preview son gratuitos, pero requieren inscripción, la parte gratuita explica únicamente conceptos, la versión de paga explica cómo se implementan en kotlin https://www.functionalhub.com/courses/take/introduction-functional-programming-kotlin/lessons/2222826-what-is-functional-programming. 

No olvides echar un vistazo a este pequeñó tutorial de programación funcional oficial de Kotlin, que se enfoca en la migración desde Python. Aquí se explica un poco el concepto de funciones lambda o inline functions. https://kotlinlang.org/docs/tutorials/kotlin-for-py/functional-programming.html


