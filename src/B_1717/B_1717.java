package B_1717;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B_1717 {
    static Scanner sc = new Scanner(System.in);
    static int n=sc.nextInt();
    static int[] parent = new int[n+1];
    public static void main(String[] args) throws IOException {
        for(int i=0; i<=n; i++){
            parent[i]=i;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m=sc.nextInt();
        for(int i=0; i<m; i++){
            int d=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(d==0){
                union(x,y);
            }else{
                if(find(x)==find(y)) bw.write("YES\n");
                else bw.write("NO\n");
                bw.flush();
            }
        }
    }
    public static int find(int x){
        if(x==parent[x]) return x;
        else return parent[x]=find(parent[x]);
    }
    public static void union(int x,int y){
        x=find(x);
        y=find(y);
        if(x<y) parent[y]=x;
        else parent[x]=y;
    }

}