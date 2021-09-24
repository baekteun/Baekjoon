package B_1009;

import java.io.*;
import java.util.StringTokenizer;

public class B_1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < t; ++q) {
            st = new StringTokenizer(br.readLine());
            int res = 1;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int i = 0; i < b; ++i) {
                res *= a;
                if(res>=10)
                    res %=10;
                if(res==0) {
                    res = 10;
                    break;
                }
            }
            sb.append(res).append('\n');
        }
        System.out.println(sb);
    }
}
