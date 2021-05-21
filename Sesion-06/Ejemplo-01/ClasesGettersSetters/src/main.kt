fun main(){

    val user = User(
        "Pedro",
        "Navaja",
        38,
        "Casado",
        true
    )

    // getter y setter de name
    println(user.name)
    user.name = "Rebeca"

    //getters de lastName (no tiene setter)
    println(user.lastName)


    //setter de status (no tiene getter)
    user.setStatus("Soltero")

    //getter y setter de edad
    println(user.userAge)
    user.setAge(33)

    //getter y setter de propiedad male (que cambia a isMale por regla)
    println("El usuario es hombre? ${user.isMale}")
    user.isMale = false
}