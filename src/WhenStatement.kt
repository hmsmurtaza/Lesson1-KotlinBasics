fun main() {
    learningWhen(28)
}

fun learningWhen(result: Int) {
    when(result) {
        0-> println("No result")
        in 1 .. 39 -> println("Got results!")
        else -> println("That's a lost of results!")
    }
}