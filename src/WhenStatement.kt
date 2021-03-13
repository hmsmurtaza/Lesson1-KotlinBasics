class WhenStatement {
    val results = 30

    fun printResults() {
        when (results) {
            0 -> println("No results")
            in 1..39 -> println("Got results!")
            else -> println("That's a lot of results!")
        }
    }
}

fun main() {
    WhenStatement().printResults()
}