# Reto 01 - Funciones literales y Funciones de orden superior

## OBJETIVO 

-  Implementar funciones de orden superior usando funciones lambda.

## REQUISITOS 

1. Revisar a detalle el [Ejemplo 01](./Ejemplo-01)

## DESARROLLO

1. Escribe una función normal que reciba el precio de un producto y un cupón promocional.

2. Crear una función de orden superior que va a recibir una función que arroja el total a pagar, esta función debe imprimir el precio con un mensaje.

3. la función de la parte 1 debe evaluar los siguientes casos ddel cupón

	a) Al ingresar "NOIVA", el precio va sin IVA
	b) Al ingresar "HALFIVA", Se cobra el precio con un impuesto del 8%
	c) Al ingresar "MINUS100", Se descuenta 100 pesos al precio final
	d) Al ingresar "PROMO2020", habrán varios casos
	 	si el precio es entre 0 y 1000 pesos, se aplica 12% de impuestos
		si el precio es entre 1000 y 2000, el impuesto es del 4%
		si el valor oscila entre 2000 y 4000, el precio final con impuestos se va a la mitad
		si el valor es mayor a 4000, el precio baja dos tercios y va sin impuestos
	e) Al ingresar un cupón inválido, cobrar el monto con IVA


4. Prueba la función con distintos cupones para validar tu código!


</br>

[Siguiente](../Ejemplo-02)