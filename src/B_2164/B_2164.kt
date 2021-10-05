package B_2164

import java.io.*
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val q = LinkedList<Int>()
    for (i in 1..n)
        q.add(i)
    while (q.size!=1){
        q.pop()
        q.add(q.pop())
    }
    print(q.pop())
}