package B_4299;

import java.io.*;
import java.util.*;

public class B_4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = (s+m)/2;
        int y = s - x;
        if((s-m)<0 || (s-m)%2!=0) System.out.println(-1);
        else{
            System.out.println(Math.max(x,y)+" "+Math.min(x,y));
        }

    }
}
