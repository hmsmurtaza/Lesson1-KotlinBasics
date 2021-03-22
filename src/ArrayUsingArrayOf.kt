import kotlin.collections.contentToString as contentToString

// 📌 Arrays store multiple items
// 📌 Array elements can be accessed programmatically through their indices
// 📌 Array elements are mutable (Changeable)
// 📌 Array size is fixed

//💡With an array defined with val, you can't change which array the variable
//  refers to, but you can still change the contents of the array

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