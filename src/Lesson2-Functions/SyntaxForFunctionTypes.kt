package `Lesson2-Functions`

fun main() {
    val waterFilter: (Int) -> Unit = { level -> println(level / 2) }
    println(waterFilter(2))
}