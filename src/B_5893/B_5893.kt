package B_5893

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    println((readLine().toBigInteger(2) * 17.toBigInteger()).toString(2))
}