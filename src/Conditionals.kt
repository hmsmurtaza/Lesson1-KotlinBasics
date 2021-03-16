fun main(args: Array<String>) {
//    Control Flow
//    Kotlin features several ways to implement conditional logic
//    If/ Else statements
//    When statements
//    For loops
//    While loops

//    If/ Else statements
    val numberOfCups = 30
    val numberOfPlates = 50

    if (numberOfCups > numberOfPlates) {
        println("Too many cups")
    } else {
        println("Not enough cups!")
    }

//  If statement with multiple cases
    val guests = 30
    if (guests == 0) {
        println("No guests")
    } else if (guests < 20) {
        println("Small group of people")
    } else {
        println("Large group of people")
    }
}