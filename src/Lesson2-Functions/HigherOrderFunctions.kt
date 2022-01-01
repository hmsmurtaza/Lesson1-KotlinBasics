package `Lesson2-Functions`

fun main() {
    val enc1: (String) -> String = {input -> input.toUpperCase()}
    println(encodeMsg("abc", enc1))
}

fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
}