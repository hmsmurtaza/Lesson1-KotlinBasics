// 🔴 Function types
// 📌 Kotlin's syntax for function types is closely related to its syntax for lambdas.
//    Declare a variable that holds a function

fun main() {
    var waterFilter: (Int) -> Int = {level -> level /2}
    println(waterFilter(2))
}