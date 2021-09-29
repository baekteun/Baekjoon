package B_1547

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val t = readLine().toInt()
    val ball = BooleanArray(4)
    ball[1] = true
    var temp = false
    repeat(t){
        val a: IntArray = readLine().split(" ").toTypedArray().map {s -> s.toInt()}.toIntArray()
        temp = ball[a[0]]
        ball[a[0]] = ball[a[1]]
        ball[a[1]] = temp

    }
    for (i in ball.indices)
        if (ball[i]){
            println(i)
        }
}