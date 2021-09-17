package B_10162;

import java.io.*;

public class B_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[3];
        if(n >= 300){
            arr[0] = n/300;
            n%=300;
        }
        if(n >= 60){
            arr[1] = n/60;
            n%=60;
        }

        if(n%10!=0){
            System.out.println(-1);
            System.exit(0);
        }
        else{
            arr[2] = n/10;
            n%=10;
        }


        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
