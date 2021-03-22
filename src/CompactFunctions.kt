// 🔴 Compact Functions
// 📌 Compact functions, or Single expression functions, make your code more concise
//    and readable.

// ➡ Complete version
/*fun double(x: Int): Int {
    x * 2
}*/

// ➡ Compact version
fun double(x:Int): Int = x * 2
fun main() {
 println(double(x = 2))
}