package B_2512;

import java.util.*;
import java.io.*;

public class B_2512{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; ++i){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long M = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        long start = 1;
        long end = arr[N-1];
        long res = 0;
        long mid =0;
        while(start <= end){
            mid = (start+end)/2;
            long sum = 0;
            for(int i=0; i<N; ++i){
                sum += Math.min(arr[i],mid);

            }
            if(sum <= M){
                start = mid + 1;
                res = mid;
            }else{
                end = mid - 1;

            }

        }
        System.out.print(res);
    }
}