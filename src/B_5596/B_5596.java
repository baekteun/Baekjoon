package B_5596;

import java.io.*;
import java.util.*;

public class B_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a1 = br.readLine().split(" ");
        int S = 0;
        for (String s :
                a1) {
            S += Integer.parseInt(s);
        }
        String[] a2 = br.readLine().split(" ");
        int T = 0;
        for (String s :
                a2) {
            T += Integer.parseInt(s);
        }
        System.out.println(Math.max(S,T));
    }
}
