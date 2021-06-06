package B_11404;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11404 {
    static int n,m;
    static int INF = 100_000_000;
    static int[][] arr;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        m = Integer.parseInt(br.readLine());
        init();
        Floyd();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n; k++){
                if(arr[i][k]==INF) sb.append(0).append(" ");
                else sb.append(arr[i][k]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
    static void init() throws IOException {
        for(int i=0; i<=n; i++)
            Arrays.fill(arr[i],INF);
        for(int i=1; i<=n; i++){
            arr[i][i]=0;
        }
        StringTokenizer st;
        while(m-->0){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            arr[start][end] = Math.min(arr[start][end], cost);
        }
    }
    static void Floyd(){
        //경유
        for(int i=1; i<=n; i++){
            //시작
            for(int k=1; k<=n; k++){
                if(i != k){
                    //도착
                    for(int m=1; m<=n; m++){
                        if(k!=m && i != m){
                            if(arr[k][m] > arr[k][i]+arr[i][m]){
                                arr[k][m]=arr[k][i]+arr[i][m];
                            }
                        }
                    }
                }
            }
        }
    }
}
