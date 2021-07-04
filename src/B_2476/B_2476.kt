package B_2476

import java.io.*
import java.util.*
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var N = br.readLine().toInt()
    var res = 0
    var st: StringTokenizer
    while (N-- > 0) {
        st = StringTokenizer(br.readLine(), " ")
        val arr = IntArray(3)
        for (i in 0..2) {
            arr[i] = st.nextToken().toInt()
        }
        res = res.coerceAtLeast(money(arr[0], arr[1], arr[2]))
    }
    print(res)
}

fun money(a: Int, b: Int, c: Int): Int {
    return if (a == b && b == c) {
        10000 + a * 1000
    } else if (a == b) {
        1000 + a * 100
    } else if (a == c) {
        1000 + a * 100
    } else if (c == b) {
        1000 + b * 100
    } else {
        Math.max(Math.max(a, b), Math.max(b, c)) * 100
    }
}

