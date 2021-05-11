package B_1316;

import java.io.*;

public class B_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            if(group()) count++;
        }
        System.out.println(count);
    }
    static boolean group() throws IOException {
        boolean[] check = new boolean[26];
        int overlap=0;
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);
            if(overlap != now){
                if(!check[now - 97]){
                    check[now - 97] = true;
                    overlap = now;
                }
                else return false;
            }
            else{
                continue;
            }

        }
        return true;
    }
}
