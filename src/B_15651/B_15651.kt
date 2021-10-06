package B_15651

import java.io.*
import java.util.*

val sb = StringBuilder()
lateinit var arr: IntArray
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    arr = IntArray(m)
    DFS(n,m,0)
    print(sb)
}
fun DFS(n: Int, m: Int, count: Int){
    if(count==m){
        arr.forEach {
            sb.append(it).append(' ')
        }
        sb.append('\n')
        return
    }
    for (i in 1..n){
        arr[count] = i
        DFS(n, m, count + 1)
    }
}