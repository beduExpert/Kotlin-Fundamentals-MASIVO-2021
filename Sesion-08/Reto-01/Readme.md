## Introducción a las Coroutines

### OBJETIVO 

- Reforzar el aprendizaje adquirido en el (Ejemplo 1)[../Ejemplo-01]
- Probar suspensiones y bloqueos en contextos inapropiados

#### REQUISITOS 

1. Saber lanzar corrutinas
2. Poder suspender hilos

#### DESARROLLO

Comenzaremos intentando probar métodos de hilos y rutinas fuera de contexto


- Utilizar la función de suspensión ***delay()*** dentro del hilo principal, comentar lo que sucede y su causa.

<details>
	<summary>Solución</summary>
	
Nos arroja el siguiente error:

> Suspend function 'delay' should be called only from a coroutine or another suspend function

</details>

- Lanzar una corrutina y dentro de ella, suspender el hilo por un segundo. Comentar el resultado y su causa.

<details>
	<summary>Solución</summary>
Al parecer, el thread principal no para, debido a que pese a que la corrutina se lanzó desde este, el hilo donde corre es otro, este hilo soporta muchas corrutinas.

</details>



