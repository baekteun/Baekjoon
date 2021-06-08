package B_1238


import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.properties.Delegates

lateinit var list_front:ArrayList<ArrayList<Edge>>
lateinit var list_back:ArrayList<ArrayList<Edge>>
lateinit var front: IntArray
lateinit var back: IntArray
const val INF = 100_000_000
var N by Delegates.notNull<Int>()
var M by Delegates.notNull<Int>()
var X by Delegates.notNull<Int>()

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    var st = StringTokenizer(readLine()," ")
    N = st.nextToken().toInt()
    M = st.nextToken().toInt()
    X = st.nextToken().toInt()
    list_front = ArrayList()
    list_back = ArrayList()

    for (i in 0..N){
        list_front.add(ArrayList())
        list_back.add(ArrayList())
    }
    front = IntArray(N+1)
    back = IntArray(N+1)
    Arrays.fill(front, INF)
    Arrays.fill(back, INF)
    repeat(M){
        st = StringTokenizer(readLine()," ")
        var start = st.nextToken().toInt()
        var end = st.nextToken().toInt()
        var cost = st.nextToken().toInt()

        list_front[start].add(Edge(end,cost))
        list_back[end].add(Edge(start,cost))
    }
    dijkstra(list_front, front,X)
    dijkstra(list_back, back,X)
    var res = -1
    for(i in 1..N){
        res = res.coerceAtLeast(front[i] + back[i])
    }
    print(res)


}
fun dijkstra(list: ArrayList<ArrayList<Edge>>,distance : IntArray, start: Int){
    var visited = BooleanArray(N+1)
    var q = PriorityQueue<Edge>()
    distance[start]=0
    q.add(Edge(start,0))
    while(q.isNotEmpty()){
        val index: Int = q.poll().end
        if(visited[index]) continue
        visited[index]=true
        for(edge in list[index]){
            if(distance[edge.end] > distance[index]+edge.weight) {
                distance[edge.end] = distance[index] + edge.weight
                q.add(Edge(edge.end,distance[edge.end]))
            }

        }
    }
}
data class Edge(val end: Int,val weight: Int): Comparable<Edge> {
    override fun compareTo(other: Edge): Int = this.weight-other.weight
}
