package B_10814;

import java.io.*;
import java.util.StringTokenizer;

public class B_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder[] p = new StringBuilder[201];
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<p.length; i++){
            p[i]=new StringBuilder();
        }
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[age].append(age).append(' ').append(name).append('\n');
        }
        for(StringBuilder val : p) {
            sb.append(val);
        }
        System.out.println(sb);
    }
}
