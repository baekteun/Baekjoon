package B_1864

import java.io.*
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var str = readLine()
    val sb = StringBuilder()
    while (true){
        if(str == "#") break;
        var res: Int = 0
        str = StringBuffer(str).reverse().toString()
        str.forEachIndexed { i, c ->
            res += octToInt(c) * 8.0.pow(i.toDouble()).toInt()
        }
        sb.append(res).append('\n')
        str = readLine()
    }
    print(sb)
}
fun octToInt(x: Char): Int{
    return when(x){
        '-' -> 0
        '\\' -> 1
        '(' -> 2
        '@' -> 3
        '?' -> 4
        '>' -> 5
        '&' -> 6
        '%' -> 7
        '/' -> -1
        else -> 0
    }
}