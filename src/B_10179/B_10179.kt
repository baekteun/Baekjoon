package B_10179

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) { repeat(readLine().toInt()){ System.out.printf("$%.2f%n", readLine().toDouble().let { it - it * 0.2 }) } }
