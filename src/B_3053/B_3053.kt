package B_3053

import java.io.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val r = readLine().toInt()
    println(Math.PI*Math.pow(r.toDouble(), 2.0))
    println(2*Math.pow(r.toDouble(), 2.0))
}