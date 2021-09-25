package B_1267;

import java.io.*;
import java.util.StringTokenizer;

public class B_1267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int y = Y(arr);
        int m = M(arr);
        if(y == m){
            System.out.println("Y M "+ y);
        }else if (y<m){
            System.out.println("Y "+y);
        }else {
            System.out.println("M "+m);
        }

    }
    static int Y(int[] s){
        int res = 0;
        for (int v:
             s) {
            res += Math.floor(v/30.0)+1;
        }
        return res*10;
    }
    static int M(int[] s){
        int res = 0;
        for (int v:
                s) {
            res += Math.floor(v/60.0)+1;
        }
        return res*15;
    }

}
