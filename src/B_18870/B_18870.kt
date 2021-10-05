package B_18870

import java.io.*
import kotlin.collections.HashMap

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val sb = StringBuilder()
    val arr: IntArray = readLine().split(" ").toTypedArray().map { s -> s.toInt() }.toIntArray()
    val map = HashMap<Int, Int>()
    val sortedArr: IntArray = arr.sortedArray()
    var count = 0
    repeat(n) {
        if (map[sortedArr[it]] == null) {
            map[sortedArr[it]] = count++
        }
    }
    repeat(n){
        sb.append(map[arr[it]]).append(' ')
    }
    print(sb)
}