package B_10797;

import java.io.*;
import java.util.*;

public class B_10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        System.out.println(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).filter(s -> s == c).toArray().length);

    }
}
