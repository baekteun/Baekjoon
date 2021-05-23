package B_2667;

import java.io.*;
import java.util.*;

public class B_2667 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        n=Integer.parseInt(br.readLine());
        ArrayList<Integer> map = new ArrayList<>();
        arr = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];
        for(int i=1; i<=n; i++){
            String A = br.readLine();
            for(int k=1; k<=n; k++){
                arr[i][k]=A.charAt(k-1)-'0';
            }
        }
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n; k++){
                if(isCom(i,k)){
                    int a = dfs(i,k);
                    map.add(a);
                }
            }
        }
        Collections.sort(map);
        sb.append(map.size()).append('\n');
        for (Integer integer : map) {
            sb.append(integer).append('\n');
        }
        System.out.println(sb);
    }
    static int dfs(int x, int y){
        visited[x][y]=true;
        int count=1;
        if(isCom(x+1,y)) count+=dfs(x+1,y);
        if(isCom(x,y+1)) count+=dfs(x,y+1);
        if(isCom(x-1,y)) count+=dfs(x-1,y);
        if(isCom(x,y-1)) count+=dfs(x,y-1);

        return count;
    }
    static boolean isCom(int x, int y){
        if( x < 1 || x > n || y < 1 || y > n) return false;
        if(visited[x][y] || arr[x][y] == 0) return false;
        return true;
    }
}