package B_1085;

import java.io.*;
import java.util.StringTokenizer;

public class B_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int xMin = Math.min(arr[0], Math.abs(arr[0]-arr[2]));
        int yMin = Math.min(arr[1], Math.abs(arr[1]-arr[3]));
        System.out.println(Math.min(xMin, yMin));
    }
}
