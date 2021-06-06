package B_11404

import java.io.*
import java.util.*
import kotlin.properties.Delegates


val br = BufferedReader(InputStreamReader(System.`in`))
val INF = 100_000_000
var n by Delegates.notNull<Int>()
var m by Delegates.notNull<Int>()
lateinit var arr: Array<IntArray>
fun main(args: Array<String>){
    val sb = StringBuilder()
    n = br.readLine().toInt()
    m = br.readLine().toInt()
    arr = Array<IntArray>(n+1) { IntArray(n + 1) }
    Init()
    FLoyd()
    for(i in 1..n){
        for(k in 1..n){
            if(arr[i][k] == INF) sb.append(0).append(" ")
            else  sb.append(arr[i][k]).append(" ")
        }
        sb.append('\n')
    }
    print(sb)
}
fun Init(){
    for(i in 1..n)
        Arrays.fill(arr[i],INF)
    for(i in 0..n)
        arr[i][i]=0
    var st: StringTokenizer
    while(m-->0){
        st = StringTokenizer(br.readLine()," ")
        var start= st.nextToken().toInt()
        var end= st.nextToken().toInt()
        var cost= st.nextToken().toInt()
        arr[start][end] = Math.min(arr[start][end],cost)
    }
}
fun FLoyd(){
    //경로
    for(i in 1..n){
        //시작
        for(k in 1..n){
            //도착
            if(i != k) {
                for (m in 1..n) {
                    if (i != m && k != m) {
                        if(arr[k][m] > arr[k][i] + arr[i][m])
                            arr[k][m] = arr[k][i] + arr[i][m]
                    }
                }
            }
        }
    }
}