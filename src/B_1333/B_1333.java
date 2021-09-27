package B_1333;

import java.io.*;
import java.util.*;

public class B_1333 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        ArrayList<Boolean> enable = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            for(int j = 0; j < L; j++) {
                enable.add(true);
            }

            if(i != N-1) {
                for(int j = 0; j < 5; j++) {
                    enable.add(false);
                }
            }
        }
        int res = 0;
        while(res < enable.size()) {
            if(!enable.get(res)) {
                break;
            }
            res += D;
        }
        System.out.println(res);
    }
}
