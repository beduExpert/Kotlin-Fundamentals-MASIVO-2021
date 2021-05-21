package classes

interface IPromotion {
    val discount: Int //el descuento en porcentaje o en cantidad
    val typeDiscount: Int //porcentaje o cantidad

    fun getDiscountPrice(amount:Int): Int{ //obtener el precio real ya con el descuento
        return if(typeDiscount == 0) { //0 es porcentaje
            (amount * (100-discount))/100
        } else{ //cantidad específica
            amount - discount
        }
    }
}