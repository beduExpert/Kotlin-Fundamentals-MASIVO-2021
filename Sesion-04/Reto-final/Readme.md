## Reto final

### OBJETIVO

- Orientar el proyecto a un diseño apegado a POO
- Dimensionar las posibilidades de integración de los temas vistos en la sesión al proyecto.

#### REQUISITOS

1. Saber definir los conceptos polimorfismo, herencia y encapsulamiento.
2. Aplicar los conceptos anteriores.
3. Terminar los ejercicios de la [Sesión](../)

#### DESARROLLO

En este reto rediseñaremos algunas clases previamente definidas, crear nuevas para complementar nuestro proyecto e implementar nuevos concepto en general.

* Un ejemplo que hemos tocado concurrentemente son los Productos, que podría ser la clase abstracta y heredar a varias clases que formen parte del core de nuestra aplicación, como objetos de electónica, perfumes, teléfonos, etc. También podríamos crear una clase abstracta *Videogame* y creamos distintas subclases de videojuegos como para Nintendo Switch o PS4. Para el caso de una red social podríamos hacer una clase abstracta *Post* que extienda a clases como *ImagePost* , *TextPost* *RecommendationPost* etc. 

* Para interfaces, podríamos tomar el ejemplo de redes sociales y crear la interfaz *Shareable* o *IShare* para agregar la capacidad de compartir una publicación, o *Likeable* para poder likes e incluso comentarios. Para un proyecto de calificación de películas, podríamos crear una interfaz para calificar películas. 

* Las clases previamente definidas para el proyecto que tengan como objetivo único almacenar información pueden ser reemplazados por *Data classes*, e incluso crear nuevas. Una aplicación de pago de parquímetros utiliza la clase Vehículo para consultar los datos de tu coche, para crearlos, para editarlos y para eliminarlos, por lo que podríamos modelarlo con una Data class.

* Podríamos tener la necesidad de almacenar los tipos de colores disponibles en concreto para una tienda de zapatos, y guardarlos en varias variables o en un arreglo dentro de un companion object para que tengamos acceso a los colores disponibles y asignarlo a un objeto zapato().
