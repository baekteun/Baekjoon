import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter
import java.util.*


fun main(args: Array<String>) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    sc.nextLine()
    val arr = arrayOfNulls<String>(a)
    for (i in 0 until a) {
        arr[i] = sc.nextLine()
    }
    Arrays.sort(arr) { s1: String?, s2: String? ->
        if (s1!!.length < s2!!.length) {
            return@sort -1
        } else if (s1.length == s2.length) {
            if (getSum(s1) == getSum(s2)) {
                return@sort s1.compareTo(s2)
            } else {
                return@sort Integer.compare(getSum(s1), getSum(s2))
            }
        } else {
            return@sort 1
        }
    }
    for (i in arr.indices) {
        bw.write(
            """
                ${arr[i].toString()}
                
                """.trimIndent()
        )
        bw.flush()
    }
}

fun getSum(a: String?): Int {
    var sum = 0
    for (i in 0 until a!!.length) {
        if (a[i] - '0' in 0..9) {
            sum += a[i] - '0'
        }
    }
    return sum
}