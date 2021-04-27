package B_2750;
import java.io.*;
import java.util.*;

public class B_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a= Integer.parseInt(br.readLine());
        int [] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=0; i<a; i++){
            bw.write(arr[i]+"\n");
            bw.flush();
        }
    }
}
