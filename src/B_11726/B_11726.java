package B_11726;

import java.io.*;

public class B_11726 {
    static int[] d=new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(tile(Integer.parseInt(br.readLine())));
    }
    static int tile(int x){
        if(x==1) return 1;
        if(x==2) return 2;
        if(d[x]!=0) return d[x];
        return d[x]= (tile(x-1)+tile(x-2)) %10007;
    }
}
