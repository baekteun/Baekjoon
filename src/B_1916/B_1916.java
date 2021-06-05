package B_1916;

import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int end;
    int weight;
    public Node(int end,int weight){
        this.end = end;
        this.weight = weight;
    }
    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}
public class B_1916 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static List<Node>[] list;
    static int[] dist;
    static int N,M;
    static int INF = 100_000_000;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        list = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<>();
        }
        dist = new int[N+1];
        Arrays.fill(dist,INF);
        StringTokenizer st;
        while(M-->0){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end,cost));
        }
        st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        dijk(A);
        System.out.println(dist[B]);

    }
    static void dijk(int start){
        PriorityQueue<Node> q = new PriorityQueue<>();
        boolean[] visited = new boolean[N+1];
        q.add(new Node(start,0));
        dist[start]=0;
        while(!q.isEmpty()){
            Node curNode = q.poll();
            int cur = curNode.end;
            if(visited[cur]) continue;
            visited[cur]=true;
            for(Node node : list[cur]){
                if(dist[node.end] > dist[cur] + node.weight) {
                    dist[node.end] = dist[cur] + node.weight;
                    q.add(new Node(node.end,dist[node.end]));
                }
            }
        }

    }
}
