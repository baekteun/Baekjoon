package B_1247

import java.io.*
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    repeat(3){
        val t = readLine().toInt()
        var res: BigInteger = BigInteger.valueOf(0)
        repeat(t){
            res = res.add(BigInteger(readLine()))

        }
        sb.append(pm(res)).append('\n')
    }
    print(sb)
}
fun pm(x: BigInteger): Char {
    return when(x.compareTo(BigInteger("0"))){
        0 -> '0'
        1 -> '+'
        -1 -> '-'
        else -> ' '
    }
}