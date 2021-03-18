//💡As well as a when statement,you can also define a when expression
// that provides a return statement

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