package B_9012

import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter
import java.util.*



@Throws(IOException::class)
fun main(args: Array<String>) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    for (i in 0 until t) {
        val n = sc.next()
        val res = vps(n)
        bw.write(
            """
                  $res
                  
                  """.trimIndent()
        )
        bw.flush()
    }
}

fun vps(n: String): String {
    var count = 0
    for (i in 0 until n.length) {
        if (n[i] == '(') count++ else if (count == 0 && n[i] == ')') return "NO" else count--
    }
    return if (count == 0) "YES" else "NO"
}
