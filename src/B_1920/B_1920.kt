package B_1920

import java.io.*
import java.util.*


var sb = StringBuilder()
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st: StringTokenizer
    val N = br.readLine().toInt()
    val arr = IntArray(N)
    st = StringTokenizer(br.readLine(), " ")
    for (i in 0 until N) {
        arr[i] = st.nextToken().toInt()
    }
    var M = br.readLine().toInt()
    Arrays.sort(arr)
    st = StringTokenizer(br.readLine(), " ")
    while (M-- > 0) search(st.nextToken().toInt(), arr)
    println(sb)
}
fun search(x: Int, arr: IntArray) {
    var start = 0
    var end = arr.size - 1
    var mid: Int
    while (true) {
        mid = (start + end) / 2
        if (x == arr[mid]) {
            sb.append('1').append('\n')
            break
        }
        if (start >= end) {
            sb.append('0').append('\n')
            break
        }
        if (x < arr[mid]) end = mid - 1 else if (x > arr[mid]) start = mid + 1
    }
}
