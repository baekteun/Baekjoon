package B_1333

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())

    val N = st.nextToken().toInt()
    val L = st.nextToken().toInt()
    val D = st.nextToken().toInt()
    val enable = ArrayList<Boolean>()

    for (i in 0 until N) {
        for (j in 0 until L) {
            enable.add(true)
        }
        if (i != N - 1) {
            for (j in 0..4) {
                enable.add(false)
            }
        }
    }
    var res = 0
    while (res < enable.size) {
        if (!enable[res]) break

        res += D
    }
    println(res)
}