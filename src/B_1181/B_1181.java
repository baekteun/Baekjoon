package B_1181;

import java.io.*;
import java.util.*;

public class B_1181 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = sc.nextInt();
        sc.nextLine();
        String arr[]=new String[a];
        for(int i=0; i<a; i++){
            arr[i]=sc.nextLine();
        }
        Arrays.sort(arr, (s1, s2) -> {
            if(s1.length()==s2.length()) return s1.compareTo(s2);
            else return s1.length() - s2.length();
        });
        bw.write(arr[0]+"\n");
        bw.flush();
        for(int i=1; i<a; i++){
            if(!arr[i].equals(arr[i-1])){
                bw.write(arr[i]+"\n");
                bw.flush();
            }
        }
    }
}
