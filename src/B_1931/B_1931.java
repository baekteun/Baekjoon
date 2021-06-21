package B_1931;

import java.io.*;
import java.util.*;

public class B_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2) {
                if(s1[1]==s2[1]) return s1[0]-s2[0];
                return s1[1]-s2[1];
            }
        });
        int count = 0;
        int now = -1;
        for(int[] s : arr){
            if(s[0]>=now){
                now = s[1];
                count++;
            }
        }
        System.out.println(count);
    }
}