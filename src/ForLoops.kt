//💡You don't need to define an iterator variable and increment it
// for each pass

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