package B_10162

import java.io.*
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var n = readLine().toInt()
    val arr: IntArray = IntArray(3)

    if (n >= 300) {
        arr[0] = n / 300
        n %= 300
    }
    if (n >= 60) {
        arr[1] = n / 60
        n %= 60
    }

    if (n % 10 != 0) {
        println(-1)
        exitProcess(0)
    } else {
        arr[2] = n / 10
        n %= 10
    }

    print("${arr[0]} ${arr[1]} ${arr[2]}")
}