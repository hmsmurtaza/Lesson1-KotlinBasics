class ForLoops {
    val pets = arrayOf("dog", "cat", "canary")

    fun printPetNames() {
        for(element in pets){
            print(element + " ")
        }
    }
}

fun main() {
    ForLoops().printPetNames()
}