package B_1966

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    var T = br.readLine().toInt() // 테스트 케이스
    while (T-- > 0) {
        var st = StringTokenizer(br.readLine())
        val N= st.nextToken().toInt()
        val M= st.nextToken().toInt()
        val q = LinkedList<IntArray>()
        st = StringTokenizer(br.readLine())
        for (i in 0 until N) {
            q.offer(intArrayOf(i, st.nextToken().toInt()))
        }
        var count=0
        while (!q.isEmpty()) {
            val front = q.poll()
            var ismax = true
            for (i in q.indices) {
                if (front[1] < q[i][1]) {
                    q.offer(front)
                    for (k in 0 until i) {
                        q.offer(q.poll())
                    }
                    ismax = false
                    break
                }
            }
            if (!ismax) continue
            count++
            if (front[0] == M) break
        }
        sb.append(count).append('\n')
    }
    println(sb)
}
