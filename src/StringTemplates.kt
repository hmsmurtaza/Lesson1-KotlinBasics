fun main(args: Array<String>) {
    // a string template starts with a dollar sign ($) and can be a simple value:
    val i = 10
    println("i = $i")

    // or an expression inside curly braces
    val s = "abc"
    println("$s.length is ${s.length}")
}