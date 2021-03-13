class MutableLists {
    val mutableList = mutableListOf("trumpet", "piano", "violin")

    fun printMutableListElements() {
        print(mutableList)
    }

    fun removeMutableListElement() {
        mutableList.remove("piano")
        printMutableListElements()
    }
}

fun main() {
    val obj = MutableLists()
    obj.printMutableListElements()
//    println(MutableLists())
    obj.removeMutableListElement()
//    println(MutableLists())
    obj.printMutableListElements()
}