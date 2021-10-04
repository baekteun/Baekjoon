package B_4153

import java.io.*
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    var a: Int
    var b: Int
    var c: Int
    StringTokenizer(readLine()).let {
        a = it.nextToken().toInt();
        b = it.nextToken().toInt()
        c = it.nextToken().toInt()
    }

    val sb = StringBuilder()
    while (a+b+c!=0){
        if(Math.pow(a.toDouble(),2.0)+Math.pow(b.toDouble(),2.0)==Math.pow(c.toDouble(),2.0)||
            Math.pow(a.toDouble(),2.0)+Math.pow(c.toDouble(),2.0)==Math.pow(b.toDouble(),2.0)||
            Math.pow(c.toDouble(),2.0)+Math.pow(b.toDouble(),2.0)==Math.pow(a.toDouble(),2.0))
            sb.append("right")
        else
            sb.append("wrong")
        sb.append('\n')
        StringTokenizer(readLine()).let {
            a = it.nextToken().toInt();
            b = it.nextToken().toInt()
            c = it.nextToken().toInt()
        }
    }
    print(sb)
}