package B_5575;

import java.io.*;
import java.util.*;

public class B_5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int k = 0; k < 3; k++) {
            st = new StringTokenizer(br.readLine());
            int[] A = new int[6];
            for (int i = 0; i < 6; ++i) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            int t1 = (A[0] * 3600) + (A[1]*60) + A[2];
            int t2 = (A[3] * 3600) + (A[4]*60) + A[5];
            int res = t2 - t1;
            int h = (res/3600)%24;
            int m = (res/60)%60;
            int s = (res)%60;
            sb.append(h).append(" ").append(m).append(" ").append(s).append('\n');
        }
        System.out.println(sb);
    }
}
