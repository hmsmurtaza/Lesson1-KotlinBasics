import java.io.FilenameFilter

// 🔴 Higher-order functions take functions as parameters, or return a function
fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    /*val enc1: (String) -> String = { input -> input.toUpperCase() }
    println(encodeMsg("abc", enc1))
    println(); println();

    val sumResult = calculate(x = 4, y = 5, ::sum)
    val mulResult = calculate(x = 4, y = 5) { a, b -> a * b }
    println("sumResult $sumResult mulResult $mulResult")*/

    /*callMe {
        println("Hello Kotlin")
    }

    sayAssalamUAlaikum("Shoaib") {
            println(it)
    }

    foo("AssalamUAlaikum") {
        it.reversed()
    }

    add(9, 10) {
        println(it)
    }*/
//    Kotlin function as an argument
//    higherOrderFunction(::sayHello, "Shoaib")
//  Kotlin function as return value
    /*val functionName = higherOrderFunction()
    println("Checking reference/ value:- $functionName")
    functionName("Shoaib")*/

//  Kotlin Lambda as an argument
    /*higherOrderFunction({name: String->
        println("Inside the lambda function")
        println("say hello to $name")
    }, "Shoaib")*/

//  Kotlin Lambda as a return value
    /*val function = higherOrderFunction()
    function("Shoaib")*/


//  One way
//  higherOrderFunction(::sayHello, "Shoaib")

//  Second way
    /*higherOrderFunction({name: String->
        println("Inside the lambda function")
        println("say hello to $name")
    }, name = "Shoaib")*/

//  Third way
    /*val function = higherOrderFunction()
    function("Shoaib")*/

//  Fourth way
    val function = higherOrderFunction()
    function("Shoaib")
}

// Kotlin function as an argument
/*fun higherOrderFunction(functionName: (name: String) -> Unit, name: String) {
    println("In Higher order function")
    println("Calling sayHello() function")
    functionName(name)
}

fun sayHello(name: String) {
    println("In sayHello() function")
    println("say hello to $name")
}*/
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Kotlin Function as a return value
/*fun higherOrderFunction(): (String) -> Unit {
    println("In Higher order function")
    return ::sayHello
}

fun sayHello(name: String) {
    println("In sayHello() function")
    println("say hello to $name")
}*/
// +++++++++++++++++++++++++++++++++++++++++++++

// Kotlin Lambda as an argument
/*fun higherOrderFunction(function: (name: String) -> Unit, name: String) {
    println("In higherOrderFunction() function")
    println("Calling received function")
    function(name)
}*/
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Kotlin Lambda as a return value
/*fun higherOrderFunction():(name: String)->Unit {
    println("In higherOrderFunction() function")
    return {
        name -> println("Inside the lambda function")
        println("say hello to $name")
    }
}*/
// +++++++++++++++++++++++++++++++++++++++++++++++++
/*
fun callMe(func: () -> Unit) {
    func()
}

fun sayAssalamUAlaikum(name: String, body: (String) -> Unit) {
    body("AssalamUAlaikum $name")
}

fun foo(str: String, func: (String) -> String) {
    var returnedValue = func(str)
    println(returnedValue)
}

fun add(a: Int, b: Int, action: (Int) -> Unit) {
    action(a + b)
}
*/

/*
// One way
fun higherOrderFunction(function: (String) -> Unit, name: String) {
    println("Inside higherOrderFunction() function")
    function(name)
}

fun sayHello(name: String) {
    println("Inside sayHello() function")
    println("say hello to $name")
}*/

// Second way
/*fun higherOrderFunction(function: (String) -> Unit, name: String) {
    println("Inside higherOrderFunction() function")
    println("Calling received function")
    function(name)
}*/

// Third way
/*fun higherOrderFunction(): (String) -> Unit {
    println("Inside higherOrderFunction() function")
    return ::sayHello
}

fun sayHello(name: String) {
    println("Inside sayHello() function")
    println("say hello to $name")
}*/

// Fourth way
fun higherOrderFunction(): (String) -> Unit {
    println("Inside higherOrderFunction() function")
    return {String->
        println("Inside Lambda function")
        println("say hello to $String")
    }
}