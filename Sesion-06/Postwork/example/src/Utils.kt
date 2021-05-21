import java.text.NumberFormat
import java.util.*

object Utils {
    fun formatPrice(price: Float?): String {
        val currencyInstance = NumberFormat.getCurrencyInstance()
        currencyInstance.currency = Currency.getInstance("MXN")
        return currencyInstance.format(price)
    }
}