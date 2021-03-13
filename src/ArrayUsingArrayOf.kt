import java.util.Arrays

class ArrayUsingArrayOf {
    private val pets = arrayOf("dog", "cat", "canary")

    /*fun printAnimalNames() {
        println(java.util.Arrays.toString(pets))
    }*/

    fun printAnimalNames() {
        println(pets.contentToString())
    }
}

fun main() {
    ArrayUsingArrayOf().printAnimalNames()
}