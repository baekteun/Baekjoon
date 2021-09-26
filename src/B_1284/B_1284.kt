package B_1284

import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    var n = br.readLine().toInt()
    while (n != 0) {
        sb.append(addr(n)).append('\n')
        n = br.readLine().toInt()
    }
    println(sb)
}

fun addr(x: Int): Int {
    var x = x
    var res = 1
    while (x > 0) {
        val n = x % 10
        x /= 10
        res += when(n){
            1 -> 3
            0 -> 5

            else -> 4
        }
    }
    return res
}

