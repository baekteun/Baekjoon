package B_10942;

import java.util.*;
import java.io.*;


public class B_10942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T+1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=1; i<=T; ++i){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if(Pellin(start,end,arr)){
                sb.append('1').append('\n');
            }else{
                sb.append('0').append('\n');
            }
        }
        System.out.print(sb);



    }
    static boolean Pellin(int start, int end, int[] arr){
        while(start <= end){
            if(arr[start] != arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }


}