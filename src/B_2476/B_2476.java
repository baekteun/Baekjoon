package B_2476;

import java.io.*;
import java.util.*;

public class B_2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = 0 ;
        StringTokenizer st;
        while(N-->0){
            st = new StringTokenizer(br.readLine()," ");
            int[] arr = new int[3];
            for(int i=0; i<3; ++i){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            res = Math.max(res, money(arr[0],arr[1],arr[2]));

        }
        System.out.print(res);

    }
    static int money(int a,int b,int c){
        if(a == b && b == c){
            return 10_000 + a * 1_000;
        }
        else if(a == b){
            return 1_000 + a * 100;
        }
        else if(a == c){
            return 1_000 + a * 100;
        }
        else if(c == b){
            return 1_000 + b * 100;
        }
        else{
            return Math.max(Math.max(a,b), Math.max(b,c)) * 100;
        }
    }

}
