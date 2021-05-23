package B_1003;

import java.io.*;

public class B_1003 {
    static Integer[][] arr = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            fi(N);
            sb.append(arr[N][0]).append(" ").append(arr[N][1]).append('\n');
        }
        System.out.println(sb);
    }
    static Integer[] fi(int x){
        if(arr[x][0]==null || arr[x][1]==null){
            arr[x][0]=fi(x-1)[0] + fi(x-2)[0];
            arr[x][1]=fi(x-1)[1]+fi(x-2)[1];
        }
        return arr[x];
    }
}
