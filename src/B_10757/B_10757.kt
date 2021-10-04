package B_10757

import java.io.*
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())
    print(st.nextToken().toBigInteger().add(st.nextToken().toBigInteger()))
}