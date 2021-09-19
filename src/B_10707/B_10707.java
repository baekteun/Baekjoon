package B_10707;

import java.io.*;

public class B_10707 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        System.out.println(Math.min(xCom(a,p),yCom(b,c,d,p)));

    }

    static int xCom(int a, int p){
        return a*p;
    }

    static int yCom(int b, int c, int d,int p){
        if(p>c){
            return b + ((p-c)*d);
        }else{
            return b;
        }
    }
}
