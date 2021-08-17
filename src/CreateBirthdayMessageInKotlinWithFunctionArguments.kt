fun main() {
    val pattern = "'-._,-'"
    val timesToRepeat = 3
    printBorder(pattern, timesToRepeat)
    println("Happy Birthday, Hadi!")
    printBorder(pattern, timesToRepeat)
}

fun printBorder(pattern: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(pattern)
    }
    println()
}
