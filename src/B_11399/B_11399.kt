package B_11399

import java.io.*
import java.util.*

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    var arr = IntArray(n)
    val st = StringTokenizer(readLine()," ")
    for (i in 0 until n){
        arr[i]=st.nextToken().toInt()
    }
    Arrays.sort(arr)
    var res = 0
    for (i in 0 until n){
        for (k in 0 until i+1){
            res += arr[k]
        }
    }
    print(res)
}