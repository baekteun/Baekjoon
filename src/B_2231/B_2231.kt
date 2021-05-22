package B_2231

import java.io.*
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    for (i in 0 until N) {
        var n = 0
        var ii = i
        while (ii > 0) {
            n += ii % 10
            ii /= 10
        }
        if (n + i == N) {
            println(i)
            return
        }
    }
    println(0)
}
