package B_5543

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bur: IntArray = IntArray(3)
    for(i in 0 until bur.count()){
        bur[i] = readLine().toInt()
    }
    val mBur: Int = Arrays.stream(bur).min().asInt

    val sid: IntArray = IntArray(2)
    for(i in 0 until sid.count()){
        sid[i] = readLine().toInt()
    }
    val mSid: Int = Arrays.stream(sid).min().asInt
    print((mBur+mSid)-50)
}