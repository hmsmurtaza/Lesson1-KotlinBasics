package `Lesson2-Functions`

fun main() {
    printHello("Murtaza")
}

// if a function does not return any useful value, its return type is Unit.
// The Unit return type declaration is optional

fun printHello(name: String?): Unit {
    println("Hi there!")
}