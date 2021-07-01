package B_3009;

import java.util.*;
import java.io.*;

public class B_3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] n1 = { Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] n2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
        st = new StringTokenizer(br.readLine(), " ");
        int[] n3 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

        int x;
        int y;

        if (n1[0] == n2[0]) {
            x = n3[0];
        }

        else if (n1[0] == n3[0]) {
            x = n2[0];
        }

        else {
            x = n1[0];
        }

        if (n1[1] == n2[1]) {
            y = n3[1];
        }

        else if (n1[1] == n3[1]) {
            y = n2[1];
        }

        else {
            y = n1[1];
        }

        System.out.println(x + " " + y);

    }
}