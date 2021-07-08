package B_2110

import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine(), " ")
    val N = st.nextToken().toInt()
    val value = st.nextToken().toInt()
    val arr = IntArray(N)
    for (i in 0 until N) {
        arr[i] = br.readLine().toInt()
    }
    Arrays.sort(arr)
    var start = 1
    var end = arr[N - 1] - arr[0]
    var res = 0
    while (start <= end) {
        var count = 1
        var dist = arr[0]
        val mid = (start + end) / 2
        for (i in 0 until N) {
            if (arr[i] - dist >= mid) {
                dist = arr[i]
                count++
            }
        }
        if (count >= value) {
            start = mid + 1
            res = mid
        } else {
            end = mid - 1
        }
    }
    print(res)
}