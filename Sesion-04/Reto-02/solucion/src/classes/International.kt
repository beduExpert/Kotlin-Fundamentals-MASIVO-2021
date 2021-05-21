package classes

class International(override val country: String, override val city: String) : Travel(){


    private val germanyFees =  mapOf(
        "Munich" to 980,
        "Berlín" to 820,
        "Francfort" to 850
    )

    private val chileFees =  mapOf(
        "Santiago" to 643,
        "Valparaíso" to 721
    )

    private val canadaFees =  mapOf(
        "Vancouver" to 620,
        "Ottawa" to 680,
        "Montreal" to 600
    )

    val taxGermany = 0.16
    val taxChile = 0.5
    val taxCanada = 0.1


    override fun getPrice(numDays: Int): Int {
        when(country){
            "Alemania" ->{
                val fee = germanyFees[city]
                if(fee==null){
                    return 0
                }
                return (fee * numDays * (1 + taxGermany) ).toInt()

            }
            "Chile" ->{
                val fee = chileFees[city]
                if(fee==null){
                    return 0
                }
                return (fee * numDays * (1 + taxChile)).toInt()
            }
            "Canada" ->{
                val fee = canadaFees[city]
                if(fee==null){
                    return 0
                }
                return (fee * numDays * (1 + taxCanada) ).toInt()
            }
            else ->{
                return 0
            }
        }
    }

}