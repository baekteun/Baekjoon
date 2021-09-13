package B_5522;

import java.io.*;

public class B_5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += Integer.parseInt(br.readLine());
        }
        System.out.println(res);
    }
}
