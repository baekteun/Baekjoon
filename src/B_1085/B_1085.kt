package B_1085

import java.io.*
import java.util.*
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())
    val arr = IntArray(4)
    for (i in arr.indices) {
        arr[i] = st.nextToken().toInt()
    }
    val xMin = arr[0].coerceAtMost(abs(arr[0] - arr[2]))
    val yMin = arr[1].coerceAtMost(abs(arr[1] - arr[3]))
    println(xMin.coerceAtMost(yMin))
}