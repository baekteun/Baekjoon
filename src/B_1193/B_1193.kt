package B_1193

import java.io.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    var l = 0
    var e = 0
    while (n>e){
        e += ++l
    }
    val dif = e - n
    when(l%2){
        0 -> print("${l-dif}/${dif+1}")
        else -> print("${dif+1}/${l-dif}")
    }
}