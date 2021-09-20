package B_10768

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val m: Int = readLine().toInt()
    val d: Int = readLine().toInt()
    if (m == 2) {
        if (d == 18) {
            println("Special")
        } else {
            println(BA(d > 18))
        }
    } else {
        println(BA(m > 2))
    }
}
fun BA(i: Boolean): String {
    return if (i) {
        "After"
    } else {
        "Before"
    }
}