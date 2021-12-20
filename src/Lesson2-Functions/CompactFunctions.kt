package `Lesson2-Functions`

// Compact or single expression functions make your code more concise and readable
fun main() {
    println(double(234))
}

// complete version
/*fun double(x: Int): Int {
    x * 2
}*/

// compact version
fun double(x: Int): Int = x * 2