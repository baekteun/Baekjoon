package B_1267

import java.io.*
import java.util.*
import kotlin.math.floor

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n: Int = readLine().toInt()
    val arr = IntArray(n)
    val st = StringTokenizer(readLine())
    for (i in 0 until n) {
        arr[i] = st.nextToken().toInt()
    }
    val y = Y(arr)
    val m = M(arr)
    if (y == m) {
        println("Y M $y")
    } else if (y < m) {
        println("Y $y")
    } else {
        println("M $m")
    }
}
fun Y(s: IntArray): Int {
    var res = 0
    for (v in s) {
        res += (floor(v / 30.0) + 1).toInt()
    }
    return res * 10
}

fun M(s: IntArray): Int {
    var res = 0
    for (v in s) {
        res += (floor(v / 60.0) + 1).toInt()
    }
    return res * 15
}