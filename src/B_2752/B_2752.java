package B_2752;

import java.io.*;
import java.util.*;

public class B_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String [] a = s.split(" ");
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i]=Integer.parseInt(a[i]);
        }
        Arrays.sort(arr);
        for(int i=0; i<3; i++){
            System.out.print(arr[i]+" ");
        }

    }
}