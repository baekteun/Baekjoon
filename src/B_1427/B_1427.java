package B_1427;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class B_1427 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        while(N > 0){
            arr.add(N%10);
            N/=10;
        }
        Collections.sort(arr);
        for(int i=arr.size()-1; i>=0; i--){
            bw.write(arr.get(i).toString());
            bw.flush();
        }
    }
}