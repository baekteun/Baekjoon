package B_1598

import java.io.*
import java.util.*
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())

    val x = st.nextToken().toInt()
    val y = st.nextToken().toInt()

    val xx = (x - 1) / 4
    val yx = (y - 1) / 4

    val xy = (x - 1) % 4
    val yy = (y - 1) % 4

    println(abs(xx - yx) + abs(xy - yy))

}