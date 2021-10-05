package B_11866

import java.io.*
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    sb.append('<')
    val n = readLine().split(" ")
    val arr = LinkedList<Int>()
    for (i in 1..n[0].toInt())
        arr.add(i)
    var count = 0
    while (arr.size > 1){
        count = (count+(n[1].toInt()-1)) % arr.size
        sb.append(arr.removeAt(count)).append(", ")
    }
    sb.append(arr.removeAt(0))
    sb.append('>')
    print(sb)
}