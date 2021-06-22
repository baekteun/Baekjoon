package B_7576

import java.io.*
import java.util.*
import kotlin.properties.Delegates

data class tomato(val x:Int,val y:Int)

var N by Delegates.notNull<Int>()
var M by Delegates.notNull<Int>()
var arr:Array<IntArray> = arrayOf()


fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    var st = StringTokenizer(readLine()," ")
    M = st.nextToken().toInt()
    N = st.nextToken().toInt()

    arr = Array(N){IntArray(M)}


    for(i in 0 until N){
        st = StringTokenizer(readLine(), " ")
        for (k in 0 until M){
            arr[i][k] = st.nextToken().toInt()
        }
    }
    print(bfs())
}
fun bfs():Int {
    var q: Queue<tomato> = LinkedList<tomato>()
    for(i in 0 until N){
        for(k in 0 until M){
            if(arr[i][k] == 1)
                q.add(tomato(i,k))
        }
    }
    var dx:IntArray = intArrayOf(-1,1,0,0)
    var dy:IntArray = intArrayOf(0,0,-1,1)
    while(!q.isEmpty()){
        val dq = q.poll()
        for(i in 0 until 4){
            var NextX = dq.x + dx[i]
            var NextY = dq.y + dy[i]
            if(NextX < 0 || NextY < 0 || NextX >= N || NextY >= M)
                continue
            if(arr[NextX][NextY]!=0)
                continue
            q.add(tomato(NextX,NextY))
            arr[NextX][NextY] = arr[dq.x][dq.y]+1
        }
    }
    var res = 0
    for(i in 0 until N){
        for(k in 0 until M){
            if(arr[i][k]==0) {
                return -1
            }
            res = Math.max(res, arr[i][k])
        }
    }
   return res-1
}
