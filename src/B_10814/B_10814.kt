package B_10814

import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st: StringTokenizer
    val p = arrayOfNulls<StringBuilder>(201)
    val sb = StringBuilder()
    val N = br.readLine().toInt()
    for (i in p.indices) {
        p[i] = StringBuilder()
    }
    for (i in 0 until N) {
        st = StringTokenizer(br.readLine(), " ")
        val age = st.nextToken().toInt()
        val name = st.nextToken()
        p[age]!!.append(age).append(' ').append(name).append('\n')
    }
    for (`val` in p) {
        sb.append(`val`)
    }
    println(sb)
}