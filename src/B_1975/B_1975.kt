package B_1975

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    repeat(readLine().toInt()){
        val n = readLine().toInt()
        var count = 0
        for (i in 2 until n){
            val str = Integer.toString(n, i)
            if(str[str.lastIndex]=='0') count++
        }
        println(count)
    }


}