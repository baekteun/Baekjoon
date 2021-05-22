package B_2231;

import java.io.*;

public class B_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int n=0;
            int ii=i;
            while(ii>0){
                n += ii%10;
                ii/=10;
            }
            if(n + i==N){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
