package B_5554

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var t = 0
    for (i in 0..3) {
        t += readLine().toInt()
    }
    println(t / 60)
    println(t % 60)
}