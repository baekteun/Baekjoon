package B_11399;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr;
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int res=0;
        for(int i=0; i<N; i++){
            for(int k=0; k<i+1; k++){
                res+=arr[k];
            }
        }
        System.out.println(res);

    }
}
