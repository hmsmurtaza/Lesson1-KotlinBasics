fun main(args: Array<String>) {
//    -> Powerful type inference
//         -> Let the compiler infer the type
//         -> You can explicitly declare the type if needed
//    -> Mutable and immutable variables
//         -> Immutability not enforced, but recommended

//    Kotlin is statically typed language.  The type is resolved at compile time
//    and never changes

    var width: Int = 12
    var length = 2.5

//   💡 important: Once a type has been assigned by you or the compiler,
//    you can't change the type or you get an error

//   💡 Mutable and Immutable
//    Mutable (Changeable)
    var score = 10
//    Immutable (Unchangeable)
    val name = "Muhammad"
//  ❗ Although not strictly enforced, using immutable variables is recommended
//    in most cases

//   💡Var and Val
    var count = 1
    count = 2

    val size = 1
//    size = 2      ❗Error: val can't be reassigned
}