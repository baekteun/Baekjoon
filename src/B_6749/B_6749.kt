package B_6749

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val a: Int = readLine().toInt()
    val b: Int = readLine().toInt()
    println(b * 2 - a)
}