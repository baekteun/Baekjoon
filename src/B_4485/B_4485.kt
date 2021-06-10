package B_4485

import java.io.*
import java.util.*

lateinit var st: StringTokenizer
var dx: IntArray = intArrayOf(0,0,1,-1)
var dy: IntArray = intArrayOf(1, -1, 0, 0)

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    var count = 0
    while(true){
        count++
        val N = readLine().toInt()
        if(N==0) break
        val map = Array<IntArray>(N) { IntArray(N) } //동굴
        val visited = Array<BooleanArray>(N) { BooleanArray(N) }//좌표방문 OX
        val rupee = Array<IntArray>(N) { IntArray(N) } //다익스트라 결과
        for(i in 0 until N){
            Arrays.fill(rupee[i],N*125) // 최대 거리값으로 초기화
            st = StringTokenizer(readLine()," ")
            for(j in 0 until N){
                map[i][j] = st.nextToken().toInt()
            }
        }
        val q = PriorityQueue<Node>() // 오름차순
        q.add(Node(0,0,map[0][0])) //시작 좌표 큐에 삽입
        rupee[0][0]=map[0][0] //0,0좌표에서 잃는 루피값은 동일

        while(!q.isEmpty()){
            val node: Node = q.poll()
            val x: Int = node.x
            val y: Int = node.y
            val Rupee = node.Rupee
            if(visited[x][y]) continue // 방문 검사
            visited[x][y]=true

            //상하 좌우
            for(i in 0 until 4){
                val NextX = x + dx[i]
                val NextY = y + dy[i]

                // 맵을 넘어가지 않는지
                if(NextX < 0 || NextX >= N || NextY < 0 || NextY >= N) continue

                //현재 좌표에서 잃는 루피 + 다음 좌표에서 잃는 루피 --> 작은값 찾기
                if(rupee[NextX][NextY]> Rupee + map[NextX][NextY]){
                    rupee[NextX][NextY] = Rupee + map[NextX][NextY]
                    q.add(Node(NextX,NextY,rupee[NextX][NextY]))
                }
            }
        }
        println("Problem $count: ${rupee[N-1][N-1]}")


    }
}

data class Node(val x:Int, val y:Int, val Rupee:Int) : Comparable<Node>{
    override fun compareTo(other: Node): Int = Rupee-other.Rupee
}