package B_13866;

import java.io.*;
import java.util.*;

public class B_13866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[2];
        int[] arr2 = new int[2];
        arr1[0] = Integer.parseInt(st.nextToken());
        arr2[0] = Integer.parseInt(st.nextToken());
        arr2[1] = Integer.parseInt(st.nextToken());
        arr1[1] = Integer.parseInt(st.nextToken());
        System.out.println(Math.abs(Arrays.stream(arr1).sum()-Arrays.stream(arr2).sum()));
    }
}
