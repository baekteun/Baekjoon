package B_5575

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    var st: StringTokenizer
    for (k in 0..2) {
        st = StringTokenizer(readLine())
        val A = IntArray(6)
        for (i in 0..5) {
            A[i] = st.nextToken().toInt()
        }
        val t1 = A[0] * 3600 + A[1] * 60 + A[2]
        val t2 = A[3] * 3600 + A[4] * 60 + A[5]
        val res = t2 - t1
        val h = res / 3600 % 24
        val m = res / 60 % 60
        val s = res % 60
        sb.append(h).append(" ").append(m).append(" ").append(s).append('\n')
    }
    println(sb)
}