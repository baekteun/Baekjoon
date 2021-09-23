package B_13866

import java.io.*
import java.util.*
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())
    val arr1 = IntArray(2)
    val arr2 = IntArray(2)
    arr1[0] = st.nextToken().toInt()
    arr2[0] = st.nextToken().toInt()
    arr2[1] = st.nextToken().toInt()
    arr1[1] = st.nextToken().toInt()
    println(abs(arr1.sum() - arr2.sum()))
}