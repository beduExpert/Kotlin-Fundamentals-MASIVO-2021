# Reto 01 - Clases

## OBJETIVO 

- Analizar un problema para poder plantear su solución en términos de objetos.

## REQUISITOS 

- Haber comprendido el concepto de clase y objeto

## DESARROLLO

1. Crear una clase que represente un vehículo, que tenga las siguientes propiedades:

    * Color
    * Marca
    * Modelo
    * placas
    * encendido (prendido o apagado)
    * Gasolina
    * Encender
    * Apagar
    * Recargar

    </br>

    <details>
        <summary>Solución</summary>
        
    ```kotlin
    class Vehiculo {
        var color= ""
        var marca = ""
        var modelo = ""
        var placas = ""
        var gasolina = 0f
        var encendido = false


        fun encender(){
            encendido=true
        }

        fun apagar(){
            encendido=false
        }

        fun recargar(litros:Float){
            gasolina+=litros
        }
    }	
    ```

    </details>

    
    </br>

2. crear un objeto de Vehículo y setear los datos de tu coche:
    * color
    * marca
    * modelo
    * placas

    </br>

    <details>
        <summary>Solución</summary>
        
    ```kotlin
    val miVehiculo = Vehiculo()

    miVehiculo.color="Verde"
    miVehiculo.marca="Ford"
    miVehiculo.modelo="Focus"
    miVehiculo.placas="REM-4123"
    ```
    </details>

    </br>

3. Checar si el coche está encendido (imprimiendo el status del coche), encender el cocche y volver a checar 

    <details>
        <summary>Solución</summary>
        
    ```kotlin
    println("El coche está prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche está prendido? ${miVehiculo.encendido}")
    ```

    </details>

    </br>

4. Verificar en nivel del tanque imprimendo la cantidad de gasolina, recargar unos cuantos litros y después volver a consultar

    <details>
        <summary>Solución</summary>
        
    ```kotlin
    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El tanque tiene ${miVehiculo.gasolina}")
    ```

    </details>


</br>

[Siguiente](../Ejemplo-02)