class MutableLists {
    val mutableList = mutableListOf("trumpet", "piano", "violin")

    fun printMutableListElements() {
        print(mutableList)
    }

    fun addElement(element: String) {
        mutableList.add(element)
    }

    fun removeMutableListElement() {
        mutableList.remove("piano")
//        mutableList.removeAt(1)  ✴ Removing using index
        printMutableListElements()
    }

    fun printItemsUsingForLoopsWithIndexes() {
        for ((index, element) in mutableList.withIndex()) {
            println("Item at $index is $element")
//            print("Item at $index is $element\n")
        }
    }
}

fun main() {
    val obj = MutableLists()
    obj.printMutableListElements()
//    println(MutableLists())
    obj.addElement("Car")
    obj.printMutableListElements()
    println()
    obj.printItemsUsingForLoopsWithIndexes()
    obj.removeMutableListElement()
    println()
//    println(MutableLists())
    obj.printMutableListElements()
}