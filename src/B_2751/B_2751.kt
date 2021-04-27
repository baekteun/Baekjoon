import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val range = 2000001
    val sb = StringBuilder()
    val num= BooleanArray(range)

    for(i in 0 until N) {
        num[br.readLine().toInt() + 1000000] = true
    }

    for(i in num.indices) {
        if(num[i]) sb.append(i - 1000000).append("\n")
    }
    println(sb)
}