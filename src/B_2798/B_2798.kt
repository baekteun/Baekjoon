package B_2798

import java.io.*
import java.util.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st: StringTokenizer
    st = StringTokenizer(br.readLine(), " ")
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    val arr = IntArray(N)
    st = StringTokenizer(br.readLine(), " ")
    for (i in 0 until N) {
        arr[i] = st.nextToken().toInt()
    }
    var res:Int = 0
    for(i in 0 until N-2){
        for(k in i+1 until N-1){
            for(m in k+1 until N){
                var temp = arr[i]+arr[k]+arr[m]

                if(M == temp){
                    print(temp)
                    return
                }
                if(temp < M && temp > res){
                    res = temp
                }
            }
        }
    }
    print(res)
}