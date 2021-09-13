package B_1297;

import java.io.*;
import java.util.*;

public class B_1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double res = Math.pow(c,2)/(Math.pow(a,2)+Math.pow(b,2));
        System.out.println((int)Math.sqrt(res*Math.pow(a,2))+" "+(int) Math.sqrt(res*Math.pow(b,2)));

    }
}
