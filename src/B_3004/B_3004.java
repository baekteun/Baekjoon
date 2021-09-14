package B_3004;

import java.io.*;

public class B_3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = n / 2;
        int y =  n - x;
        System.out.println((x+1)*(y+1));
    }
}
