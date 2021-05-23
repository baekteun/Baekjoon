package B_2667

import java.io.*
import java.util.*



var br = BufferedReader(InputStreamReader(System.`in`))
var n = 0
lateinit var arr: Array<IntArray>
lateinit var visited: Array<BooleanArray>
var sb = StringBuilder()
fun main(args: Array<String>) {
    n = br.readLine().toInt()
    val map = ArrayList<Int>()
    arr = Array(n + 1) { IntArray(n + 1) }
    visited = Array(n + 1) { BooleanArray(n + 1) }
    for (i in 1..n) {
        val A = br.readLine()
        for (k in 1..n) {
            arr[i][k] = A[k - 1] - '0'
        }
    }
    for (i in 1..n) {
        for (k in 1..n) {
            if (isCom(i, k)) {
                val a = dfs(i, k)
                map.add(a)
            }
        }
    }
    map.sort()
    sb.append(map.size).append('\n')
    for (integer in map) {
        sb.append(integer).append('\n')
    }
    println(sb)
}
fun dfs(x: Int, y: Int): Int {
    visited[x][y] = true
    var count = 1
    if (isCom(x + 1, y)) count += dfs(x + 1, y)
    if (isCom(x, y + 1)) count += dfs(x, y + 1)
    if (isCom(x - 1, y)) count += dfs(x - 1, y)
    if (isCom(x, y - 1)) count += dfs(x, y - 1)
    return count
}
fun isCom(x: Int, y: Int): Boolean {
    if (x < 1 || x > n || y < 1 || y > n) return false
    return !(visited[x][y] || arr[x][y] == 0)
}
