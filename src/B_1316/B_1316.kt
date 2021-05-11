package B_1316

import java.io.*


var br = BufferedReader(InputStreamReader(System.`in`))
fun main(args: Array<String>) {
    var count = 0
    val N = br.readLine().toInt()
    for (i in 0 until N) {
        if (group()) count++
    }
    println(count)
}
@Throws(IOException::class)
fun group(): Boolean {
    val check = BooleanArray(26)
    var overlap = 0
    val str = br.readLine()
    for (i in 0 until str.length) {
        val now = str[i].toInt()
        if (overlap != now) {
            if (!check[now - 97]) {
                check[now - 97] = true
                overlap = now
            } else return false
        } else {
            continue
        }
    }
    return true
}