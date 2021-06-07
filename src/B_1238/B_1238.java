package B_1238;

import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int end;
    int weight;
    public Node(int end, int weight){
        this.end = end;
        this.weight = weight;
    }
    @Override
    public int compareTo(Node o) {
        return weight-o.weight;
    }
}
public class B_1238 {
    static int n,m,x;
    static List<List<Node>> list_front, list_back;
    static int[] Front, back;
    static int INF = 100_000_000;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        list_front = new ArrayList<>();
        list_back = new ArrayList<>();


        for(int i=0; i<=n; i++){
            list_front.add(new ArrayList<>());
            list_back.add(new ArrayList<>());
        }
        Front = new int[n+1];
        back = new int[n+1];
        Arrays.fill(Front, INF);
        Arrays.fill(back, INF);
        while(m-->0) {
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            list_front.get(start).add(new Node(end,cost));
            list_back.get(end).add(new Node(start,cost));
        }
        dijkstra(list_front,Front,x);
        dijkstra(list_back,back,x);
        int res=-1;
        for(int i=1; i<=n; i++){
            res = Math.max(res, Front[i]+back[i]);
        }
        System.out.println(res);

    }
    static void dijkstra(List<List<Node>> list, int[] distance, int start){
        boolean[] visited = new boolean[n+1];
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(start,0));
        distance[start] = 0;
        while(!q.isEmpty()){
            int index = q.poll().end;
            if(visited[index]) continue;
            visited[index] = true;
            for(Node node : list.get(index)){
                if(distance[node.end] > distance[index]+node.weight){
                    distance[node.end] = distance[index] + node.weight;
                    q.add(new Node(node.end, distance[node.end]));
                }
            }
        }


    }

}
