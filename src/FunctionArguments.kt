// 📌 Functions may have:
// 🛑 Default parameters
// 🛑 Required parameters
// 🛑 Named arguments

// 🛑 Default parameters
// 🔴 Default values provide a fallback if no parameter value is passed
fun drive(speed: String = "fast") {
    println("driving $speed")   // 📌 Use = after the type to define default values
}

// 🛑 Required parameters
// 📌 If no default is specified for a parameter, the corresponding argument is required
fun tempToday(day: String, temp: Int) {
    println("Today is $day and it's $temp degrees")
}

// 🔴 Default Vs Required
// 📌 Functions can have a mix of default and required parameters
fun reformat(str: String,
            divideByCamelHumps: Boolean,
            wordSeparator: Char,
            normalizeCase: Boolean = true) {
    println("$str $divideByCamelHumps $wordSeparator $normalizeCase")
}

// 🔴 Named arguments
// 📌 To improve readability, use named arguments for required arguments
// 📌 It is considered good style to put default arguments after positional arguments,
//    that way callers only have to specify the required arguments
fun main() {
    val str = "Hello Kotlin"

    drive() // ➡ driving fast
    drive("slow")   // ➡ driving slow
    drive(speed = "turtle-like")    // ➡ driving turtle-like

    tempToday("Sunday", 20)

    reformat("Today is a day like no other day", false, '-')

    reformat(str, divideByCamelHumps = false, wordSeparator = '_')
}
