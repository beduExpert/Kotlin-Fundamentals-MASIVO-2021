
	
# Reto 01 - Funciones

# OBJETIVO 

- Crear funciones a partir de lo aprendido en el [Ejemplo 1](../Ejemplo-01)

## REQUISITOS 

1. Saber implementar funciones

## DESARROLLO

1. Crear una función que calcule el área de un rectángulo por medio de su base y altura, implementarla en *main*
2. Crear otra función para calcular el volumen de un prisma rectangular, utilizar la función de área


    <details>
        <summary>Solución</summary>
        
    - Respuesta a 1)
        ```kotlin
        fun main(){
            val base = 20f
            val altura =4f
            val area = areaRectangulo(base,altura)
            println("el área del rectángulo es $area")
        }

        fun areaRectangulo(base: Float, altura: Float):Float{
            return base*altura
        }
        ```

    - Respuesta a 2)
        ```kotlin
        fun main(){
        ...
        val ancho = 2f

        ...
        val volumen = volumenPrisma(base,altura,ancho)
        println("el volumen del prisma es $volumen")
        }
        ...

        fun volumenPrisma(base: Float, altura:Float, ancho: Float):Float{
            return areaRectangulo(base,altura)*ancho
        }
        ```

    </details>

    </br>

3. Una función puede tener parámetros con valores por defecto en caso de que no se setee ninguno, a continuación cómo se implementa: 

    ```kotlin
    fun imprimir(
        valor: String = "Este es el primer valor por defecto",
        valor2: String = "Este es el segundo valor por defecto"){
        println(valor)
        println(valor2)
    }
    ```

    Se pueden asignar los dos valores o sólo el primer valor si se ingresan los valores simplemente

    ```kotlin
    imprimir("Reemplazo del primer valor")
    imprimir("Reemplazo del primer valor","Reemplazo del segundo valor")
    ```

    Para setear únicamente el segundo String, requerimos especificar el nombre del parámetro:

    ```kotlin
    imprimir(valor2="Reemplazo del segundo valor")
    ```

    Correr los ejemplos anteriores 

4. Con el ejemplo anterior, crear una función que entregue el promedio de tres calificaciones. Esta debe recibir dos parámetros con calificaciones por defecto 8, y el tercer parámetro no debe venir predefinido. 

    <details>
        <summary>Solución</summary>
        
    ```kotlin
    fun promedio(primera: Float = 8f,
                segunda: Float = 8f,
                tercera: Float): Float{
        return (primera + segunda + tercera)/3f
    }
    ```
    </details>

    </br>

5. Utilizar la función *promedio*, Comentar qué pasa si se ingresa sólo una calificación en la función y después con dos. Finalmente, buscar que la función corra enviando únicamente la tercera calificación con 10f:

    <details>
        <summary>Solución</summary>
        
    ```kotlin
    val promedio = promedio(tercera = 10f)
    ```

    el resultado debe ser: 

    > El promedio del alumno es 8.666667

    </details>

    </br>

6. **OPCIONAL:** Buscar una forma de redondear la calificación





</br>

[Siguiente](../Ejemplo-02)




