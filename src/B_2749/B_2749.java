package B_2749;

import java.io.*;

public class B_2749 {
    static long[] fi = new long[1_500_000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        fi[0]=0;
        fi[1]=1;
        long n = Long.parseLong(br.readLine());
        for(int i=2; i<1_500_000 && i<=n; i++){
            fi[i]=(fi[i-1]+fi[i-2])%1000000;
        }
        if(n>=1_500_000){
            n%=1_500_000;
        }
        System.out.println(fi[(int)n]);
    }
}
