package B_5522

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var res = 0
    for (i in 0..4) {
        res += readLine().toInt()
    }
    println(res)
}