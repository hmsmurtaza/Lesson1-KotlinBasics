// Ranges in if else statements

class Ranges {
    val numberOfStudents = 50

    fun printNumberOfStudents() {
        if (numberOfStudents in 1..100) {
            println(numberOfStudents)
        }
    }
}

fun main() {
    Ranges().printNumberOfStudents()
}