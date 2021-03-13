class ControlFlow {

    val numberOfCups = 30
    val numberOfPlates = 50

    fun getDifference(){
        if (numberOfCups > numberOfPlates) {
            println("Too many cups!")
        }
        else{
            println("Not enough cups!")
        }
    }

}

fun main() {
    ControlFlow().getDifference()
}
