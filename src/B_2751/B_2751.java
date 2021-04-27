package B_2751;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class B_2751 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int a= Integer.parseInt(br.readLine());
        for(int i=0; i<a; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for(int i=0; i<a; i++){
            sb.append(arr.get(i)).append("\n");
        }
        System.out.println(sb);
    }

}
