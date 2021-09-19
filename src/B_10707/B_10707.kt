package B_10707

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val a: Int = readLine().toInt()
    val b: Int = readLine().toInt()
    val c: Int = readLine().toInt()
    val d: Int = readLine().toInt()
    val p: Int = readLine().toInt()
    println(xCom(a, p).coerceAtMost(yCom(b, c, d, p)))
}
fun xCom(a: Int, p: Int): Int {
    return a * p
}

fun yCom(b: Int, c: Int, d: Int, p: Int): Int {
    return if (p > c) {
        b + (p - c) * d
    } else {
        b
    }
}