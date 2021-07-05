package B_2512

import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine(), " ")
    val N = st.nextToken().toInt()
    val arr = IntArray(N)
    st = StringTokenizer(br.readLine(), " ")
    for (i in 0 until N) {
        arr[i] = st.nextToken().toInt()
    }
    val M = br.readLine().toInt().toLong()
    Arrays.sort(arr)
    var start: Long = 1
    var end = arr[N - 1].toLong()
    var res: Long = 0
    var mid: Long = 0
    while (start <= end) {
        mid = (start + end) / 2
        var sum: Long = 0
        for (i in 0 until N) {
            sum += Math.min(arr[i], mid.toInt())
        }
        if (sum <= M) {
            start = mid + 1
            res = mid
        } else {
            end = mid - 1
        }
    }
    print(res)
}