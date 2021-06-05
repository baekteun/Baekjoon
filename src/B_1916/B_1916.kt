import java.io.*
import java.util.*

data class Edge(val index: Int,val dist:Int): Comparable<Edge>{
    override fun compareTo(other: Edge): Int {
        return dist-other.dist
    }
}
private lateinit var arr: ArrayList<ArrayList<Edge>>
private lateinit var dist: IntArray
private const val INF = 100_000_000
private val n:Int =readLine()!!.toInt()
fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val m:Int = readLine().toInt()
    arr =ArrayList()
    for(i in 0..n)
        arr.add(ArrayList())
    dist = IntArray(n +1) { INF }
    for(i in 1..m){
        val (start,end,cost) = readLine().split(" ").map{it.toInt()}
        arr[start].add(Edge(end, cost))
    }
    var (A,B) = readLine().split(" ").map{it.toInt()}
    dijk(A)
    print(dist[B])

}
fun dijk(start: Int){
    var q = PriorityQueue<Edge>()
    var visited = BooleanArray(n +1)
    q.add(Edge(start,0))
    dist[start]=0
    while(!q.isEmpty()){
        var curEdge: Edge = q.poll()
        var cur: Int =curEdge.index
        if(visited[cur]) continue
        visited[cur] = true
        for(edge in arr[cur]){
            if(dist[edge.index] > dist[cur] + edge.dist){
                dist[edge.index] = dist[cur]+edge.dist
                q.add(Edge(edge.index, dist[edge.index]))
            }
        }


    }
}
