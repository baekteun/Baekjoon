package B_1212


import java.io.*
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val binArr: Array<String> = arrayOf("000","001","010","011","100","101","110","111")
    val s: String = readLine()
    val sb: StringBuilder = StringBuilder()
    for(i in s.indices){
        val cur:Int = s[i] - '0'
        if(i==0 && cur<4){
            if(cur<2){
                sb.append(binArr[cur].substring(2))
            }else{
                sb.append(binArr[cur].substring(1))
            }
        }else{
            sb.append(binArr[cur])
        }
    }
    print(sb)

}