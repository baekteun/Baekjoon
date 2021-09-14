package B_3004

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val x = n/2
    val y = n - x
    print((x+1)*(y+1))

}