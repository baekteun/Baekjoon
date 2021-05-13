package B_1920;

import java.io.*;
import java.util.*;

public class B_1920 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        st = new StringTokenizer(br.readLine()," ");
        while(M --> 0)
            search(Integer.parseInt(st.nextToken()),arr);

        System.out.println(sb);
    }
    public static void search(int x, int[] arr){
        int start=0,end=arr.length-1, mid;
            while(true){
                mid = (start+end)/2;
                if(x == arr[mid]){
                    sb.append('1').append('\n');
                    break;
                }
                if(start>=end) {
                    sb.append('0').append('\n');
                    break;
                }
                if (x < arr[mid]) end = mid - 1;
                else if (x > arr[mid]) start = mid + 1;
            }
    }
}
