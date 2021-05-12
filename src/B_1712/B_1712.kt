package B_1712

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var va = StringTokenizer(br.readLine()," ")
    var A = va.nextToken().toInt()
    var B = va.nextToken().toInt()
    var C = va.nextToken().toInt()
    if (C <= B) println(-1) else println(A / (C - B) + 1)
}
