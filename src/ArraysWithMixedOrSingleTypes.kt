class ArraysWithMixedOrSingleTypes {

    // An array can contain different types
    private val mix = arrayOf("hats", 2)

    fun printArrayContent() {
        println(mix.contentToString())
    }

    // An array can also contain just one type (integers in this case)
    private val numbers = intArrayOf(1.5.toInt(), 2, 3)

    fun printIntegerArray() {
        println(numbers.contentToString())
    }
}

fun main() {
    val obj = ArraysWithMixedOrSingleTypes()
    obj.printArrayContent()
    obj.printIntegerArray()
}