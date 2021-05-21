

class SmartWatch(
    price: Float,
    name: String,
    sku: String) : Product( price, name, sku) {
    override fun getTotalPrice(quantity: Int): Float {
        return quantity*price
    }


}