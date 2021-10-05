package B_1002

import java.io.*
import java.util.*
import kotlin.math.pow

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    repeat(readLine().toInt()){
        StringTokenizer(readLine()).let {
            sb.append(point(it.nextToken().toInt(), it.nextToken().toInt(), it.nextToken().toInt(), it.nextToken().toInt(), it.nextToken().toInt(), it.nextToken().toInt())).append('\n')
        }
    }
    print(sb)

}
fun point(x1: Int, y1: Int, r1: Int, x2: Int, y2: Int, r2: Int): Int {
    val dist = ((x2 - x1).toDouble().pow(2.0) + (y2 - y1).toDouble().pow(2.0)).toInt()



    return if (x1 == x2 && y1 == y2 && r1 == r2) {
        -1
    } else if (dist > (r1 + r2).toDouble().pow(2.0)) {
        0
    } else if (dist < (r2 - r1).toDouble().pow(2.0)) {
        0
    } else if (dist.toDouble() == (r2 - r1).toDouble().pow(2.0)) {
        1
    } else if (dist.toDouble() == (r1 + r2).toDouble().pow(2.0)) {
        1
    } else {
        2
    }
}