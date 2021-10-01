package B_1703

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    while (true){
        val st = StringTokenizer(readLine())
        val t = st.nextToken().toInt()
        if (t==0) break
        var res = 1
        repeat(t){
            res *= st.nextToken().toInt()
            res -= st.nextToken().toInt()
        }
        sb.append(res).append('\n')
    }
    print(sb)
}