package B_2606;

import java.io.*;
import java.util.*;

public class B_2606 {
    static boolean[] visited;
    static LinkedList<Integer>[] adjList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        adjList= new LinkedList[N+1];
        visited= new boolean[N+1];
        for(int i=1; i<=N; i++)
            adjList[i]=new LinkedList<Integer>();
        int M = Integer.parseInt(br.readLine());
        while(M --> 0){
            st = new StringTokenizer(br.readLine()," ");
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }
        DFS(1);
        int res=0;
        for(int i=1; i<=N; i++){
            if(visited[i]) res++;
        }
        System.out.println(res-1);

    }
    static void DFS(int u){
        visited[u]=true;
        for(int i : adjList[u]){
            if(!visited[i]) DFS(i);
        }
    }
}
