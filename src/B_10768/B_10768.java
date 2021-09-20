package B_10768;

import java.io.*;

public class B_10768 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        if(m==2){
            if(d==18){
                System.out.println("Special");
            }else{
                System.out.println(BA(d>18));
            }
        }else{
            System.out.println(BA(m>2));
        }

    }
    static String BA(boolean i){
        if (i) {
            return "After";
        } else {
            return "Before";
        }
    }
}
