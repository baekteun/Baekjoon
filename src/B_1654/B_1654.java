package B_1654;

import java.util.*;
import java.io.*;

public class B_1654{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int K = Integer.parseInt(st.nextToken());
        long N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        long start = 1;
        long end = 1;
        for(int i=0; i<K; ++i){
            arr[i] = Integer.parseInt(br.readLine());
            end = Math.max(end, arr[i]);
        }
        Arrays.sort(arr);
        while(start <= end){
            long mid = (start+end)/2;
            long total = 0;
            for(int i=0; i<K; ++i){

                total += (arr[i]/mid);

            }
            if(total >= N){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        System.out.print(end);
    }
}