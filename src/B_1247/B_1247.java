package B_1247;

import java.io.*;
import java.math.BigInteger;

public class B_1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < 3; ++q) {
            int t = Integer.parseInt(br.readLine());
            BigInteger res = BigInteger.valueOf(0);
            for (int i = 0; i < t; ++i) {
                BigInteger b = new BigInteger(br.readLine());
                res = res.add(b);

            }
            sb.append(pm(res)).append('\n');
        }
        System.out.println(sb);
    }
    static char pm(BigInteger b){
        int res = b.compareTo(BigInteger.valueOf(0));
        if(res==0){
            return '0';
        }else if(res > 0){
            return '+';
        }else {
            return '-';
        }
    }
}
