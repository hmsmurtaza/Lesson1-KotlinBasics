fun main() {
    // check whether the numberOfBooks variable is not null. then decrement the variable
    var numberOfBooks = 6
    if (numberOfBooks != null) {
        numberOfBooks = numberOfBooks.dec()
        println(numberOfBooks)
    }

    // now look at Kotlin way of writing it, using the safe call operator
    numberOfBooks = numberOfBooks?.dec()
    println(numberOfBooks)
}