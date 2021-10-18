package B_6378

import java.io.*
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){

    var n: String = ""
    val sb = StringBuilder()
    while (readLine().also { n = it } != "0") {
        val bi = BigInteger(n)
        sb.append(
            """
            ${bi.subtract(BigInteger.ONE).mod(BigInteger("9")).add(BigInteger.ONE)}
            
            """.trimIndent()
        )
    }
    println(sb.toString())
}