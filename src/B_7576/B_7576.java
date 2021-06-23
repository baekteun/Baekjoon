package B_7576;

import java.util.*;
import java.io.*;
class tomat {
    int x;
    int y;
    public tomat(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class B_7576 {
    static int N;
    static int M;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int k=0; k<M; k++){
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.print(bfs());

    }
    static int bfs(){
        Queue<tomat> q = new LinkedList<tomat>();
        for(int i=0; i<N; i++){
            for(int k=0; k<M; k++){
                if(arr[i][k] == 1){
                    q.add(new tomat(i,k));
                }
            }
        }
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        while(!q.isEmpty()){
            tomat t = q.poll();
            for(int i=0; i<4; i++){
                int NX = t.x + dx[i];
                int NY = t.y + dy[i];
                if(NX < 0 || NX >= N || NY < 0 || NY >= M)
                    continue;
                if(arr[NX][NY] != 0)
                    continue;
                q.add(new tomat(NX,NY));
                arr[NX][NY] = arr[t.x][t.y] + 1;
            }
        }
        int res = 0;
        for(int i=0; i<N; i++){
            for(int k=0; k<M; k++){
                if(arr[i][k]==0)
                    return -1;

                res = Math.max(res,arr[i][k]);
            }
        }
        return res-1;
    }

}
