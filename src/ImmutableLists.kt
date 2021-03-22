class ImmutableLists {
    val instruments = listOf("trumpet", "piano", "violin")

    fun printListElements() {
        print(instruments)
    }

    fun printListUsingForLoops() {
        for ((index, element) in instruments.withIndex()) {
            print("Index $index is Element $element")
        }
    }

    fun addItemInList() {
        instruments.plus("drums")
    }
}

fun main() {
    val obj=ImmutableLists()
    val obj1 = obj.addItemInList()
//    obj.printListElements()
    obj.printListUsingForLoops()
}