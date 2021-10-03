package B_1964

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var res = 5
    var inc = 7
    for (i in 1 until n){
        res += inc
        inc += 3
        res %= 45678
    }


    print(res)
}