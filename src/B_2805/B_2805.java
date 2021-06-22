package B_2805;

import java.util.*;
import java.io.*;

public class B_2805{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long start = 0, end = 0, mid;
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; ++i){
            arr[i] = Integer.parseInt(st.nextToken());
            end = Math.max(end, arr[i]);
        }

        while(start <= end){
            long total = 0;
            mid = (start+end)/2;
            for(int i=0; i<N; ++i){
                if(mid < arr[i]){
                    total += arr[i] - mid;
                }
            }
            if(total < M){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        System.out.print(end);
    }
}