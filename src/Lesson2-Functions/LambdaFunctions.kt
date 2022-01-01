package `Lesson2-Functions`

// A lambda is an expression that makes a function that has no name
fun main() {
    var dirtLevel = 20
    val waterFilter = { level: Int -> level / 2 }

    println(waterFilter(dirtLevel))
}