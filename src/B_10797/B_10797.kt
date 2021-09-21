package B_10797

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val c: Int = readLine().toInt()
    print(Arrays.stream(readLine().split(" ".toRegex()).toTypedArray()).mapToInt { s: String -> s.toInt() }
        .filter { s: Int -> s == c }.toArray().size)
}