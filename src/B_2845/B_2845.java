package B_2845;

import java.io.*;
import java.util.*;

public class B_2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int L = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<5; ++i){
            sb.append(Integer.parseInt(st.nextToken()) - L).append(" ");
        }
        System.out.println(sb);
    }
}
