import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val cnt = IntArray(10001)
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    for (i in 0 until N) {
        cnt[br.readLine().toInt()]++
    }
    br.close()
    val sb = StringBuilder()
    for (i in 1..10000) {
        while (cnt[i] > 0) {
            sb.append(i).append('\n')
            cnt[i]--
        }
    }
    println(sb)
}
