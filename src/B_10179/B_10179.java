package B_10179;

import java.io.*;

public class B_10179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; ++i) {
            double x = Double.parseDouble(br.readLine());
            System.out.printf("$%.2f%n",x-(x*0.2));
        }
    }
}
