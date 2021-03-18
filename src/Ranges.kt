// Ranges in if else statements
// 💡Data type containing a span of comparable values (e.g
// integers from 1 to 100 inclusive)
// 💡Ranges are bounded
// 💡Objects within a range can be mutable or immutable

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