package clases

//como marca y modelo no cambian, usaremos val; el color puedes ser cambiado, por eso es var
class Vehiculo (val marca:String, val modelo: String, var color: String = "Negro") {

    init{
        println("""Los datos del coche son:
            marca: $marca
            modelo: $modelo
            color: $color""")
    }

    constructor(marca:String, modelo: String, color: String, placas: String): this(marca,modelo,color){
        this.placas = placas
        println("las placas son: ${this.placas}")
    }


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