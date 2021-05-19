package B_11651;

import java.io.*;
import java.util.*;

public class B_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            st=new StringTokenizer(br.readLine()," ");
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][0]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (s1,s2)->{
            if(s1[0]==s2[0]) return s1[1]-s2[1];
            else return s1[0]-s2[0];
        });
        for(int i=0; i<N; i++){
            sb.append(arr[i][1]).append(" ").append(arr[i][0]).append('\n');
        }
        System.out.print(sb);
    }
}
