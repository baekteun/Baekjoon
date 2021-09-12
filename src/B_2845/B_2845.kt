package B_2845

import java.io.*
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    var st = StringTokenizer(readLine())
    val sb = StringBuilder()
    val L = st.nextToken().toInt() * st.nextToken().toInt()
    st = StringTokenizer(readLine())
    for (i in 0..4) {
        sb.append(st.nextToken().toInt() - L).append(" ")
    }
    println(sb)
}