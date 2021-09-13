package B_3003

import java.io.*
import java.util.*

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())
    val sb = StringBuilder()
    val chess = intArrayOf(1, 1, 2, 2, 2, 8)
    for (s in chess) {
        val `in` = st.nextToken().toInt()
        sb.append(s - `in`).append(" ")
    }
    println(sb)
}