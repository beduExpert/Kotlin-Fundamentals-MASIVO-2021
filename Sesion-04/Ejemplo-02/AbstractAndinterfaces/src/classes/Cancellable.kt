package classes

interface Cancellable {

    fun cancelTravel()

    fun isCancellable(){
        println("Tu reservación puede ser cancelada en cualquier momento")
    }

}