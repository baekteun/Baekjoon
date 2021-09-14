package B_5532

import java.io.*
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val L = readLine().toInt()
    val A: Int = readLine().toInt()
    val B = readLine().toInt()
    val C: Int = readLine().toInt()
    val D = readLine().toInt()
    val s = A / C + if (A % C == 0) 0 else 1
    val d = B / D + if (B % D == 0) 0 else 1
    print(L- max(s,d))
}