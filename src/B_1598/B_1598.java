package B_1598;

import java.io.*;
import java.util.StringTokenizer;

public class B_1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int xx = (x-1)/4;
        int yx = (y-1)/4;

        int xy = (x-1)%4;
        int yy = (y-1)%4;

        System.out.println(Math.abs(xx-yx)+Math.abs(xy-yy));

    }
}
