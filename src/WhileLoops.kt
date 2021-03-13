class WhileLoops {
    var bicycles = 0

    fun incrementBicycles() {
        while (bicycles < 50) {
            bicycles++
        }
    }

    fun printFiftyTimes() {
        println("$bicycles bicycles in the bicycle rack")
    }

    fun decrementBicycles() {
        do {
            bicycles--
        }while (bicycles > 50)
    }

    fun printLessThanFiftyTimes() {
        println("$bicycles bicycles in the bicycle rack")
    }
}

fun main() {
    val obj = WhileLoops()
    obj.incrementBicycles()
    obj.printFiftyTimes()
    obj.decrementBicycles()
    obj.printLessThanFiftyTimes()
}