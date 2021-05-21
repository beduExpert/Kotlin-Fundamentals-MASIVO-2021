class IPhone : SmartPhone(21230.53F,
                        "iPhone",
                        "11 Pro",
                      "A13 Bionic"), Taxable {

    init {
        stock = 20
    }

    override fun priceWithTax(): Float {
        return price * 1.16f
    }

}