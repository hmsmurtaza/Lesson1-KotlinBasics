class IfStatementWithMultipleCases {
    val guests = 30

    fun printNumberOfGuests() {
        if(guests == 0){
            println("No guests")
        } else if (guests < 20) {
            println("Small group of people")
        } else {
            println("Large group of people")
        }
    }
}

fun main() {
    IfStatementWithMultipleCases().printNumberOfGuests()
}