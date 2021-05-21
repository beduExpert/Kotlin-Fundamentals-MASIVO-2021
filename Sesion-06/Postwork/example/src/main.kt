fun main(){

    val iPhone = IPhone()

    println("precio sin impuesto: ${ Utils.formatPrice(iPhone.price) }")
    println("precio con impuesto: ${Utils.formatPrice(iPhone.priceWithTax())}")



}