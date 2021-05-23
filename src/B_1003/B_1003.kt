package B_1003

import java.io.*


var arr = Array(41) { arrayOfNulls<Int>(2) }
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    var T = br.readLine().toInt()
    arr[0][0] = 1
    arr[0][1] = 0
    arr[1][0] = 0
    arr[1][1] = 1
    while (T-- > 0) {
        val N = br.readLine().toInt()
        fi(N)
        sb.append(arr[N][0]).append(" ").append(arr[N][1]).append('\n')
    }
    println(sb)
}
fun fi(x: Int): Array<Int?> {
    if (arr[x][0] == null || arr[x][1] == null) {
        arr[x][0] = fi(x - 1)[0]!! + fi(x - 2)[0]!!
        arr[x][1] = fi(x - 1)[1]!! + fi(x - 2)[1]!!
    }
    return arr[x]
}
