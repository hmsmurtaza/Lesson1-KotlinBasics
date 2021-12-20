fun main() {
    learningWhileLoops()
    learningDoWhileLoops()
}

fun learningWhileLoops() {
    var bicycles = 0
    while (bicycles < 50) {
        bicycles++
    }
    println("$bicycles in the bicycle rack\n")
}

fun learningDoWhileLoops() {
    var bicycles = 50
    do {
        bicycles--
    }while (bicycles >= 50)
    println("$bicycles bicycles in the bicycle rack\n")
}