## Reto final - Añadiendo POO al proyecto

### OBJETIVO
- Diseñar las entidades requeridas de acuerdo a la Programación Orientada a Objetos.
- Implementar objetos en el proyecto final.
- Adaptar el código previamente desarrollado a clases.

#### REQUISITOS

1. Haber cumplido los retos de esta sesión
2. Interpretar características y soluciones de problemas como Objetos.

#### DESARROLLO

En este reto diseñaremos e implementaremos clases en nuestro proyecto para poder clasificar nuestros métodos y variables, llevando así un esquema más organizado. En el [reto final](../../Sesion-02/Reto-final) de la [Sesión 2](../../Sesion-02) dividimos los diferentes algoritmos que componen nuestro proyecto en funciones y variables. Ahora hay que diseñar clases que cubran nuestros requerimientos y que incluyan las funciones desarrolladas. 

##### Lineamientos

* Tenemos qué pensar nuestro proyecto en objetos y en sus propiedades. Si nuestro proyecto es un sistema de pagos en línea, pensamos en un método de pago. Los métodos de pago no pueden ser modificados, pero podemos pagar servicios a través de ellos y pueden ser eliminados.
* Al tener idea de los objetos que pueden implicar tu proyecto, se deben crear las nuevas clases e integrar las tareas que utilizábamos del ejercicio anterior.  
* Da estructura a tu proyecto: Guarda tus clases en un directorio, la raíz de la carpeta de clases suele llamarse **Models**, pero puedes nombrarla de acuerdo a tus necesidades.
* Clases, objetos, constructores, funciones, propiedades y sus setters pueden tener modificadores de visibilidad (llamados también modificadores de acceso), por defecto son públicos, pero, para evitar que alguien pueda modificar datos de un objeto directamente, utiliza los otros modificadores de acuerdo a las necesidades. Así seguirás el princicpio de encapsulamiento.
* Comunmente al crear un nuevo objeto, se requieran hacer acciones extras a inicializar atributos, como imprimir algún dato del objeto, inicializar una base de datos, llamar a un web service u otra acción. Para esto, no crees un método y lo llames enseguida de la creación, utiliza un inicializador ***Init***.



