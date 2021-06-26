package B_2110;

import java.util.*;
import java.io.*;

public class B_2110{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int value = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0; i<N; ++i){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int start = 1;
        int end = arr[N-1] - arr[0];


        int res = 0;
        while(start <= end){
            int count = 1;
            int dist = arr[0];
            int mid = (start+end)/2;
            for(int i=0; i<N; ++i){
                if(arr[i]-dist >= mid){
                    dist = arr[i];
                    count++;
                }
            }
            if(count >= value){
                start = mid +1;
                res = mid;
            }else{
                end = mid - 1;
            }
        }
        System.out.print(res);

    }
}