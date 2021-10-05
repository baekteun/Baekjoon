package B_1021

import java.io.*
import java.util.*
import kotlin.collections.ArrayDeque

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().split(" ")
    val q = ArrayDeque<Int>()
    repeat(n[0].toInt()){
        q.addLast(it+1)
    }
    val st = StringTokenizer(readLine())
    var res = 0
    repeat(n[1].toInt()){
        val token = st.nextToken().toInt()
        val target = q.indexOf(token)
        if(target <= q.size/2){
            while (q.first()!=token){
                q.addLast(q.removeFirst())
                res++
            }
        }else{
            while (q.first()!=token){
                q.addFirst(q.removeLast())
                res++
            }
        }
        q.removeFirst()
    }
    print(res)
}