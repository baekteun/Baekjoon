package B_10101

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val arr = IntArray(3)
    for (i in 0..2) {
        arr[i] = readLine().toInt()
    }
    if (arr.sum() != 180) {
        println("Error")
    } else if (arr.maxOrNull() == 60) {
        println("Equilateral")
    } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
        println("Isosceles")
    } else {
        println("Scalene")
    }
}