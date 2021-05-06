package B_1158

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*


fun main(args: Array<String>) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sc = Scanner(System.`in`)
    val sb = StringBuilder()
    sb.append('<')
    val N = sc.nextInt()
    val K = sc.nextInt()
    val q: Queue<Int> = LinkedList()
    for (i in 1..N) {
        q.offer(i)
    }
    while (q.size != 1) {
        for (i in 0 until K - 1) {
            q.offer(q.poll())
        }
        sb.append(q.poll()).append(", ")
    }
    sb.append(q.poll()).append(">")
    bw.write(sb.toString())
    bw.flush()
}
