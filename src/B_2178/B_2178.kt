package B_2178

import java.io.*
import java.util.*
import kotlin.properties.Delegates

data class Dot(var x:Int , var y:Int)
var map:Array<IntArray> = arrayOf()
var visited:Array<BooleanArray> = arrayOf()
var N by Delegates.notNull<Int>()
var M by Delegates.notNull<Int>()
fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    var st = StringTokenizer(readLine()," ")
    N = st.nextToken().toInt()
    M = st.nextToken().toInt()
    map = Array<IntArray>(N){IntArray(M)}
    visited = Array<BooleanArray>(N){BooleanArray(M) {false} }
    for(i in 0 until N){
        var maze = readLine()
        for(k in 0 until M){
            map[i][k] = maze[k]-'0'
        }
    }
    visited[0][0]=false
    bfs(0,0)
    print(map[N-1][M-1])
}
fun bfs(x:Int, y:Int){
    val dx = intArrayOf(1,-1,0,0)
    val dy = intArrayOf(0,0,1,-1)
    var q:Queue<Dot> = LinkedList()
    q.add(Dot(x,y))
    while(q.isNotEmpty()){
        var d:Dot = q.poll()
        for(i in 0 until 4){
            var NX = d.x + dx[i]
            var NY = d.y + dy[i]
            if(NX < 0 || NY < 0 || NX >= N || NY >= M) continue
            if(visited[NX][NY] || map[NX][NY] == 0) continue
            q.add(Dot(NX,NY))
            map[NX][NY] = map[d.x][d.y]+1
            visited[NX][NY]=true
        }
    }
}