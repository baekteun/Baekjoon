package B_10101;

import java.io.*;
import java.util.*;

public class B_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for (int i = 0; i < 3; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if (Arrays.stream(arr).sum() != 180){
            System.out.println("Error");
        } else if (Arrays.stream(arr).max().getAsInt() == 60){
            System.out.println("Equilateral");
        } else if(arr[0]==arr[1] || arr[1] == arr[2] || arr[0] == arr[2]){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }

    }
}
