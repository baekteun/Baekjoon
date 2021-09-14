package B_5532;

import java.io.*;

public class B_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int s = (A/C) + (A%C==0 ? 0 : 1);
        System.out.println(s);
        int d = (B/D) + (B%D==0 ? 0 : 1);
        System.out.println(d);
        System.out.println(L-Math.max(s,d));
    }
}

