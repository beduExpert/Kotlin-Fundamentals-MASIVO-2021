fun main(){


 getPromo(1000.0,"RORO")


}


fun getPromo(price:Double,coupon:String){

    val getPrice:( Double, (Double) -> Double) -> Unit = { price,operation ->
        println("El precio actual de tu producto es ${operation(price)}")
    }

    val totalPrice = {price:Double ->  price*1.16}
    val halfIva = {price:Double ->  price*1.08}
    val noIva  = {price:Double ->  price}
    val ranges  = {price:Double ->
        when(price){
            in 0..1000 -> price*1.12
            in 1000..2000-> price*1.04
            in 2000..4000 -> (price*1.16)/2
            else -> price/3
    } }
    val minus100 = {price:Double ->  price*1.16 - 100 }


    when (coupon){
        "PROMO2020" -> getPrice(price,ranges)
        "NOIVA" -> getPrice(price,noIva)
        "MINUS100" -> getPrice(price,minus100)
        "HALFIVA" -> getPrice(price,halfIva)
        else -> getPrice(price,totalPrice)
    }


}


