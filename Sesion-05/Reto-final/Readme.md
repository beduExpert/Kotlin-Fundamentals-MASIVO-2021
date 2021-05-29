# Reto final - Implementando Programación funcional

## OBJETIVO
- Aproximar nuestro proyecto a la programacion funcional
- Evitar en lo posible el uso de estados mutables 

## REQUISITOS

1. Haber cumplido los retos de esta sesión
2. Interpretar características y soluciones de problemas como flujo de datos.

## DESARROLLO

Kotlin no es un lenguaje que implemente exclusivamente programación funcional. Por tanto, es bastante atinado utilizar lo mejor de dos mundos: POO y Programación funcional!

Los objetos nos dan la ventaja de crear modelos programáticos de un objeto; mientras que la programación funcional establece funciones transparentes y predecibles que no producen efectos secundarios como el almacenamiento oculto de valores, o la modificación de alguna propiedad global como efecto colateral de un proceso. 

Aquí damos algunos consejos para empezar a implementar  conceptos de este paradigma en tu código:

1. Utiliza los métodos de las estructuras de datos vistas en el [Ejemplo 3](../Ejemplo-03)

2. Cada método de una clase puede ser una función de orden superior! si necesitas ejecutar código externo al de un método de una clase después de una operación, pasar una lambda podría ser tu opción.

3. Evita utilizar el *keyword* ***var***, pues indica que la variable es mutable. Una variable mutable puede ser modificada de forma no deseada y por tanto puede producirnos errores. La inmutabilidad también aporta consistencia al estado de una aplicación.


</br>

[Siguiente](../Postwork)