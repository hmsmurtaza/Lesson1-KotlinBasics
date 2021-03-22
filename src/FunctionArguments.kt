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

fun main() {
    drive() // ➡ driving fast
    drive("slow")   // ➡ driving slow
    drive(speed = "turtle-like")    // ➡ driving turtle-like

    tempToday("Sunday", 20)

    reformat("Today is a day like no other day", false, '-')
}
