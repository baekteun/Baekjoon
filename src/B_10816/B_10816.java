package B_10816;

import java.util.*;
import java.io.*;

public class B_10816{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] card1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; ++i){
            card1[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        int[] card2 = new int[M];
        for(int i=0; i<M; ++i){
            card2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card1);
        for(int i=0; i<M; ++i){
            sb.append((Upper(card1,card2[i]) - Lower(card1,card2[i]))).append(" ");
        }
        System.out.print(sb);
    }
    static int Lower(int[] arr, int value){
        int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] >= value)
                end = mid;
            else{
                start = mid +1;
            }
        }
        return end;
    }
    static int Upper(int[] arr, int value){
        int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] > value)
                end = mid;
            else{
                start = mid +1;
            }
        }
        return end;
    }
}