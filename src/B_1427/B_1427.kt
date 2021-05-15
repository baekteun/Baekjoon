package B_1427

import java.io.*
import java.util.*



fun main(args: Array<String>) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))
    var N = br.readLine().toInt()
    val arr = ArrayList<Int>()
    while (N > 0) {
        arr.add(N % 10)
        N /= 10
    }
    arr.sort()
    for (i in arr.indices.reversed()) {
        bw.write(arr[i].toString())
        bw.flush()
    }
}
