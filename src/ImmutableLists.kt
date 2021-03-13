class ImmutableLists {
    val instruments = listOf("trumpet", "piano", "violin")

    fun printListElements() {
        print(instruments)
    }
}

fun main() {
    ImmutableLists().printListElements()
}