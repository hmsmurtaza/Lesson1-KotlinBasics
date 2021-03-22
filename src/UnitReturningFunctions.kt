// 📌 Unit returning functions
// ➡ If a function does not return any useful value, its return type is Unit.

fun main(args: Array<String>) {
    printHello("Shoaib")
}

// 📌 Unit is a type with only one value: Unit.
fun printHello(name: String?): Unit {
    println("Hi there, $name")
}
