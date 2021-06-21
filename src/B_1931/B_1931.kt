package B_1931

import java.io.*
import java.util.*

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    var N: Int = readLine().toInt()
    val Arr = Array(N) { IntArray(2) }
    for(i in 0 until N){
        var st = StringTokenizer(readLine()," ")
        Arr[i][0] = st.nextToken().toInt()
        Arr[i][1] = st.nextToken().toInt()
    }
    Arrays.sort(
        Arr
    ) { s1, s2 -> if (s1[1] == s2[1]) s1[0] - s2[0] else s1[1] - s2[1] }
    var count = 0
    var now = -1
    for (s in Arr) {
        if (s[0] >= now) {
            now = s[1]
            count++
        }
    }
    print(count)
}