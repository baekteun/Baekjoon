package B_2420

import java.io.*
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val arr: List<String> = readLine().split(" ")
    val a: Long = arr[0].toLong()
    val b: Long = arr[1].toLong()
    print(abs(a-b))
}