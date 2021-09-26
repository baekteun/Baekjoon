package B_1284;

import java.io.*;

public class B_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while(n!=0){
            sb.append(addr(n)).append('\n');
            n = Integer.parseInt(br.readLine());
        }
        System.out.println(sb);

    }
    static int addr(int x){
        int res = 1;
        while(x>0){
            int n = x%10;
            x/=10;
            if(n==1){
                res += 3;
            }else if(n==0){
                res += 5;
            }else{
                res += 4;
            }
        }
        return res;
    }

}
