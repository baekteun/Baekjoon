package B_11943

import java.io.*
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val arr1: List<String> = readLine().split(" ")
    val arr2: List<String> = readLine().split(" ")
    print(min(arr1[0].toInt() + arr2[1].toInt(), arr1[1].toInt() + arr2[0].toInt()))
}