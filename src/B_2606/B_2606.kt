package B_2606

import java.io.*
import java.util.*

lateinit var visited: BooleanArray
lateinit var adjList: Array<LinkedList<Int>?>
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st: StringTokenizer
    val N = br.readLine().toInt()
    adjList = arrayOfNulls<LinkedList<Int>>(N + 1)
    visited = BooleanArray(N + 1)
    for (i in 1..N) adjList[i] = LinkedList()
    var M = br.readLine().toInt()
    while (M-- > 0) {
        st = StringTokenizer(br.readLine(), " ")
        val v1 = st.nextToken().toInt()
        val v2 = st.nextToken().toInt()
        adjList[v1]!!.add(v2)
        adjList[v2]!!.add(v1)
    }
    DFS(1)
    var res = 0
    for (i in 1..N) {
        if (visited[i]) res++
    }
    println(res - 1)
}
fun DFS(u: Int) {
    visited[u] = true
    for (i in adjList[u]!!) {
        if (!visited[i]) DFS(i)
    }
}

