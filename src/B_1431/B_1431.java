package B_1431;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class B_1431 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        String[] arr = new String[a];
        for(int i=0; i<a; i++){
            arr[i]=sc.nextLine();
        }
        Arrays.sort(arr,(s1,s2)->{
            if(s1.length()<s2.length()) {
                return -1;
            }
            else if(s1.length()==s2.length()) {
                if(getSum(s1)==getSum(s2)) {
                    return s1.compareTo(s2);
                }
                else {
                    return Integer.compare(getSum(s1), getSum(s2));
                }
            }
            else {
                return 1;
            }

        });
        for(int i=0; i<arr.length; i++){
            bw.write(arr[i]+"\n");
            bw.flush();
        }

    }
    public static int getSum(String a){
        int sum=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)-'0'>=0 && a.charAt(i)-'0'<=9){
                sum+=a.charAt(i)-'0';
            }
        }
        return sum;
    }
}
