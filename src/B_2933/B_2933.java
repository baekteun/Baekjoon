package B_2933;

import java.util.*;
import java.io.*;

class loc{
    int x;
    int y;
    public loc(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class B_2933 {
    static ArrayList<loc> cluster;
    static int R;
    static int C;
    static char[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R+1][C+1];

        for(int i=1; i<=R; ++i){
            char[] str = br.readLine().toCharArray();
            for(int k=1; k<=C; ++k){
                map[i][k] = str[k-1];
            }
        }


        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=1; i<=N; ++i){
            int v = R-(Integer.parseInt(st.nextToken()))+1;
            if(i%2 == 0){
                for(int k = C; k >= 1; --k){
                    if(map[v][k]=='x'){
                        map[v][k]='.';
                        break;
                    }
                }
            }else{
                for(int k=1; k<=C; ++k){
                    if(map[v][k]=='x'){
                        map[v][k]='.';
                        break;
                    }
                }
            }

            bfs();
            if(cluster.size() != 0)
                drop();
            cluster.clear();

        }


        for(int i=1; i<=R; ++i){
            for(int k=1; k<=C;++k){
                System.out.print(map[i][k]);
            }
            System.out.println();
        }


    }
    static boolean Inarea(int x,int y){
        return (x < 1 || y < 1 || x > R || y > C);
    }

    static void bfs(){
        cluster = new ArrayList<>();
        Queue<loc> q = new LinkedList<>();
        boolean[][] visited = new boolean[R+1][C+1];
        for(int i=1; i<=C; ++i){
            if(map[R][i] == 'x'){
                q.offer(new loc(R,i));
                visited[R][i]=true;
            }
        }
        while(!q.isEmpty()){
            loc p = q.poll();
            for(int i=0; i<4; ++i){
                int NX = p.x + dx[i];
                int NY = p.y + dy[i];
                if(Inarea(NX,NY) || map[NX][NY]=='.' || visited[NX][NY]) continue;
                visited[NX][NY] = true;
                q.offer(new loc(NX,NY));

            }
        }


        for(int i=1; i<=R; ++i){
            for(int k=1; k<=C; ++k){
                if(map[i][k]=='x' && !visited[i][k]){
                    cluster.add(new loc(i,k));
                }
            }
        }
    }

    static void drop(){
        int count = 0;
        for(loc l : cluster){
            map[l.x][l.y] = '.';
        }
        OUTER: for(int i=1; i<=R; ++i){
            for(loc l : cluster) {
                if(l.x + i > R || map[l.x + i][l.y] == 'x'){
                    break OUTER;
                }
            }
            count = i;
        }
        for(loc l : cluster){
            map[l.x + count][l.y] = 'x';
        }
    }
}