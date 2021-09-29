package B_1547;

import java.io.*;
import java.util.StringTokenizer;

public class B_1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean[] ball = new boolean[4];
        StringTokenizer st;
        ball[1] = true;
        boolean temp = false;
        for (int i = 0; i < t; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            temp = ball[x];
            ball[x] = ball[y];
            ball[y] = temp;


        }
        for (int i = 1; i <= 3; ++i) {
            if(ball[i]) System.out.println(i);
        }
    }
}
