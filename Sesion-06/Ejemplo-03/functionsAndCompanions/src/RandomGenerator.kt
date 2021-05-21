class RandomGenerator{
    companion object {

        fun generate(): Int {
            return (0..10).random()
        }

        @JvmField
        val initialPhrase = "Hola a todos"
    }
}