package B_11650

import java.io.*
import java.util.*



fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st: StringTokenizer
    val sb = StringBuilder()
    val N = br.readLine().toInt()
    val arr = Array(N) { IntArray(2) }
    for (i in 0 until N) {
        st = StringTokenizer(br.readLine(), " ")
        arr[i][0] = st.nextToken().toInt()
        arr[i][1] = st.nextToken().toInt()
    }
    Arrays.sort(arr) { s1: IntArray, s2: IntArray ->
        if (s1[0] == s2[0]) return@sort s1[1] - s2[1]
        else return@sort s1[0] - s2[0]
    }
    for (i in 0 until N) {
        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n')
    }
    print(sb)
}

