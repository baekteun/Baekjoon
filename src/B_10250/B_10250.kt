package B_10250

import java.io.*
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    repeat(readLine().toInt()){
        val st = StringTokenizer(readLine())
        val h = st.nextToken().toInt()
        val w = st.nextToken().toInt()
        val n = st.nextToken().toInt()
        var count = 0
        for (k in 0 until w){
            for(i in 0 until h){
                count++
                if(count==n) {
                    sb.append(i+1)
                    if(k<9)
                        sb.append(0).append(k+1)
                    else
                        sb.append(k+1)

                    sb.append('\n')
                }
            }
        }
    }
    print(sb)
}