package B_2178;

import java.io.*;
import java.util.*;


class pos{
    int x;
    int y;
    public pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class B_2178 {
    static int N,M;
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            String maze = br.readLine();
            for(int k=0; k<M; k++){
                map[i][k] = maze.charAt(k)-'0';
            }
        }
        visited[0][0]=true;
        bfs(0,0);
        System.out.print(map[N-1][M-1]);
    }
    static void bfs(int x, int y){
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        Queue<pos> q = new LinkedList<>();
        q.add(new pos(x,y));
        while(!q.isEmpty()){
            pos P = q.poll();
            for(int i=0; i<4; i++){
                int NextX = P.x+dx[i];
                int NextY = P.y+dy[i];
                if(NextX < 0 || NextX >=N || NextY < 0 || NextY >=M) continue;
                if(visited[NextX][NextY] || map[NextX][NextY]==0) continue;
                visited[NextX][NextY]=true;
                map[NextX][NextY] = map[P.x][P.y]+1;
                q.add(new pos(NextX,NextY));
            }
        }
    }

}
