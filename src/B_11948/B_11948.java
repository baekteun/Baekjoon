package B_11948;

import java.io.*;
import java.util.*;

public class B_11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 4; ++i) {
            arr1.add(Integer.parseInt(br.readLine()));
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 2; ++i) {
            arr2.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        arr1.remove(0);
        arr2.remove(0);
        System.out.println((arr1.stream().mapToInt(s -> s).sum()+arr2.stream().mapToInt(s -> s).sum()));
    }
}
