package B_1212;

import java.io.*;

public class B_1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String[] binArr = {"000","001","010","011","100","101","110","111"};
        for (int i = 0; i < str.length(); i++) {
            int cur=str.charAt(i)-'0';
            if(i==0 && cur<4) {
                if(cur<2) {
                    sb.append(binArr[cur].substring(2));
                }else {
                    sb.append(binArr[cur].substring(1));
                }
            }else {
                sb.append(binArr[cur]);
            }
        }
        System.out.println(sb);

    }
}
