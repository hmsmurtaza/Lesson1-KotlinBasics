package `Lesson2-Functions`
// functions may have default parameters, required parameters, named arguments

fun main() {
/////////////////// default parameters /////////////////////////////
    drive()
    drive("slow")
    drive("turtle-like")
////////////////////////////////////////////////////////////////////
////////////////////// required parameters//////////////////////////
    tempToday("Tuesday", 8)
////////////////////////////////////////////////////////////////////
////////////////////// default vs required parameters //////////////
// to improve readability, used named arguments to required arguments
    reformat("Today is a day like no other day", divideByCamelHumps = false, wordSeparator = '-')
////////////////////////////////////////////////////////////////////
}

// required parameters
fun tempToday(day: String, temp: Int) {
    println("Today is $day and it's $temp degrees.")
}

// default parameters
fun drive(speed: String = "fast") {
    println("driving $speed")
}

// default vs required parameters
fun reformat(str: String,
divideByCamelHumps: Boolean,
wordSeparator: Char,
normalizeCase: Boolean = true) {
    println("$str $divideByCamelHumps $wordSeparator $normalizeCase")
}