package B_9012;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class B_9012 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            String n=sc.next();
            String res = vps(n);
            bw.write(res+"\n");
            bw.flush();
        }
    }
    public static String vps(String n){
        int count=0;
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)=='(') count++;
            else if(count==0&&n.charAt(i)==')') return "NO";
            else count--;
        }
        if(count==0) return "YES";
        else return "NO";
    }
}