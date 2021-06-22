package B_11497;

import java.util.*;

import java.io.*;

public class B_11497{
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int m=0; m<T; m++){
            int N = Integer.parseInt(br.readLine());
            int[] array = new int[N];
            st = new StringTokenizer(br.readLine()," ");
            for(int i=0; i<N; i++){
                array[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(array);
            int[] arr = new int[N];
            int start = 1;
            int end = N-1;

            arr[0]=array[0];
            for(int k=1; k<array.length; k++){
                if(k%2 == 0){
                    arr[start] = array[k];
                    start++;
                }
                else{
                    arr[end] = array[k];
                    end--;
                }
            }
            int res = -1;
            for(int k=0; k<arr.length-1; k++){
                res = Math.max(res, Math.abs(arr[k]-arr[k+1]));
            }
            res = Math.max(res, Math.abs(arr[N-1] - arr[0]));
            System.out.println(res);

        }
    }
}