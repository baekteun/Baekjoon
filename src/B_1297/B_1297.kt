package B_1297

import java.io.*
import java.util.*
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())
    val c = st.nextToken().toDouble()
    val a = st.nextToken().toDouble()
    val b = st.nextToken().toDouble()
    val res = c.pow(2.0) / (a.pow(2.0) + b.pow(2.0))
    print("${sqrt(res*a.pow(2)).toInt()} ${sqrt(res*b.pow(2)).toInt()}")
}