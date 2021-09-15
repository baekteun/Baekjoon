package B_5596

import java.io.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val a1: Array<String> = readLine().split(" ").toTypedArray()
    var S: Int = 0
    for(i in a1){
        S += i.toInt()
    }
    val a2: Array<String> = readLine().split(" ").toTypedArray()
    var T:Int = 0
    for(i in a2){
        T += i.toInt()
    }
    print(max(S,T))
}