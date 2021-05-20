package B_2798;

import java.io.*;
import java.util.StringTokenizer;

public class B_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st=new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int res=0;
        for(int i=0; i<N-2; i++){
            for(int k=i+1; k<N-1; k++){
                for(int m=k+1; m<N; m++){
                    int temp = arr[i]+arr[k]+arr[m];
                    if(temp == M){
                        System.out.println(temp);
                        return;
                    }
                    if (temp > res && temp < M) {
                        res = temp;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
