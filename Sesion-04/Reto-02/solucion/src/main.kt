import classes.International
import classes.National
import classes.NationalLowSeason

fun main(){

    //Viaje internacional
    val viajeBerlin = International("Alemania","Berlín")
    viajeBerlin.reserve(4)

    //Viaje a Guadalajara cancelando
    val viajeBajaGdl = NationalLowSeason("Guadalajara")
    viajeBajaGdl.reserve(4)
    viajeBajaGdl.cancelTravel()
    viajeBajaGdl.cancelTravel()
    viajeBajaGdl.reserve(2)
}