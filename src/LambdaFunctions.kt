// 🔴 Lambda functions
// 📌 A lambda is an expression that makes a function that has no name

fun main() {
    var dirLevel = 20
    var waterFilter = {level: Int -> level / 2}
    var division = {nominator: Int, denominator: Int -> nominator / denominator}
    println(waterFilter(dirLevel))
    println()
    val firstValue = 10; val secondValue = 5
    println("division " + division(10, 5))
}