package B_1436

import java.io.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    var num = 666
    var count = 1
    while (count != n){
        num++
        if(num.toString().contains("666"))
            count++
    }
    print(num)
}