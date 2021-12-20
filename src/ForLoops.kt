fun main() {
//    learningForLoops()
//    learningForLoopsWithIndexAndElement()
    learningForLoopsWithStepSizesAndRanges()
}

fun learningForLoops() {
    val pets = arrayOf("dog", "cat", "canary")
    for (element in pets) {
        print("$element ")
    }
}

fun learningForLoopsWithIndexAndElement() {
    val pets = arrayOf("dog", "cat", "canary")
    for ((index, element) in pets.withIndex()) {
        println("Item at $index is $element\n")
    }
}

// for loops: step sizes and ranges
fun learningForLoopsWithStepSizesAndRanges() {
    for (i in 1..5) print(i)
    println()
    for (i in 5 downTo -3) print(i)
    println()
    for (i in 3 .. 9 step 2) print(i)
    println()
    for (i in 'd' .. 'g') print(i)
}