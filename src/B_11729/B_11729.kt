package B_11729

import java.io.*
import kotlin.math.pow

val sb = StringBuilder()
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    println(2.toDouble().pow(n.toDouble()).toInt()-1)
    hanoi(n, 1, 2, 3)
    print(sb)
}
fun hanoi(n: Int, start: Int, mid: Int, end: Int){
    if(n==1){
        sb.append("$start $end").append('\n')
        return
    }
    hanoi(n-1, start, end, mid)
    sb.append("$start $end").append('\n')
    hanoi(n-1, mid, start, end)
}