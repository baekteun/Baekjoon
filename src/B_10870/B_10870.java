package B_10870;

import java.io.*;

public class B_10870 {
    static int[] fibo = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        fibo[0]=0;
        fibo[1]=1;
        System.out.println(fib(Integer.parseInt(br.readLine())));
    }
    static int fib(int x){
        if(x==0) return 0;
        if(fibo[x]!=0) return fibo[x];
        return fibo[x] = fib(x-1)+fib(x-2);
    }


}

