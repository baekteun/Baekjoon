package B_4299

import java.io.*
import kotlin.math.*


fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val arr = readLine().split(" ").map { it.toInt() }
    val s:Int = arr[0]
    val m:Int = arr[1]
    if((s-m) < 0 || (s-m)%2 != 0) print(-1)
    else{
        val x: Int = (s+m)/2
        val y: Int = s-x
        print("${max(x,y)} ${min(x,y)}")
    }
}