package B_1009

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val t: Int = readLine().toInt()
    var st: StringTokenizer
    val sb = StringBuilder()
    for (q in 0 until t) {
        st = StringTokenizer(readLine())
        var res = 1
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        for (i in 0 until b) {
            res *= a
            if (res >= 10) res %= 10
            if (res == 0) {
                res = 10
                break
            }
        }
        sb.append(res).append('\n')
    }
    println(sb)
}