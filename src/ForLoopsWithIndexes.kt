class ForLoopsWithIndexes {
    // for loops: elements and indexes

    private val pets = arrayOf("Cat", "Dog", "Canary")

    fun printPetNames() {
        for ((index, element) in pets.withIndex()) {
            println("Item at $index is $element")
//            print("Item at $index is $element\n")
        }
    }
}

fun main() {
    ForLoopsWithIndexes().printPetNames()
}