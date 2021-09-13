package B_3003;

import java.io.*;
import java.util.*;

public class B_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] chess = new int[] { 1,1,2,2,2,8};
        for (int s :
                chess) {
            int in = Integer.parseInt(st.nextToken());
            sb.append(s-in).append(" ");
        }
        System.out.println(sb);

    }
}
