package B_4485;

import java.io.*;
import java.util.*;
class Edge implements Comparable<Edge>{
    int x;
    int y;
    int Rupee;
    public Edge(int x, int y, int Rupee) {
        this.x = x;
        this.y = y;
        this.Rupee = Rupee;
    }
    @Override
    public int compareTo(Edge o) {
        return this.Rupee - o.Rupee;
    }
}
public class B_4485 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[][] rupee;
    public static void main(String[] args) throws IOException{
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        StringTokenizer st;
        map = new int[126][126];
        visited = new boolean[126][126];
        rupee = new int[126][126];
        int count = 0;
        while(true){
            count++;
            N = Integer.parseInt(br.readLine());
            if(N==0) break;
            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine()," ");
                Arrays.fill(rupee[i],N*125);
                for(int k=0; k<N; k++){
                    map[i][k] = Integer.parseInt(st.nextToken());
                }
            }
            PriorityQueue<Edge> q = new PriorityQueue<>();
            q.add(new Edge(0,0,map[0][0])); //시작좌표
            rupee[0][0]=map[0][0];
            while(!q.isEmpty()){
                Edge node = q.poll();
                int x = node.x;
                int y = node.y;
                int Rupee = node.Rupee;
                for(int i=0; i<4; ++i){
                    int NextX = x + dx[i];
                    int NextY = y+dy[i];
                    if(NextX < 0 || NextX >=N || NextY < 0 || NextY >= N) continue;
                    if(rupee[NextX][NextY] > Rupee+map[NextX][NextY]){
                        rupee[NextX][NextY] = Rupee+map[NextX][NextY];
                        q.add(new Edge(NextX,NextY,rupee[NextX][NextY]));
                    }


                }

            }
            System.out.println("Problem "+count+": "+rupee[N-1][N-1]);
        }
    }
}
