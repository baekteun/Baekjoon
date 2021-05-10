package B_10773

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*



fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stack = Stack<Int>()
    var res = 0
    val n = br.readLine().toInt()
    for (i in 0 until n) {
        val `in` = br.readLine().toInt()
        if (`in` == 0) {
            res -= stack.pop()
        } else {
            stack.push(`in`)
            res += `in`
        }
    }
    println(res)
}
