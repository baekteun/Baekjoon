package B_1011

import java.io.*
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    repeat(readLine().toInt()){
        var x: Int
        var y: Int
        StringTokenizer(readLine()).let { x = it.nextToken().toInt(); y = it.nextToken().toInt() }
        val dist = y-x
        val max = Math.sqrt(dist.toDouble()).toInt()
        if(max.toDouble() == Math.sqrt(dist.toDouble()))
            sb.append(2*max-1).append('\n')
        else if(dist<=max*max + max)
            sb.append(2*max).append('\n')
        else
            sb.append(2*max+1).append('\n')
    }
    print(sb)
}