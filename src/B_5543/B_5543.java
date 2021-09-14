package B_5543;

import java.io.*;
import java.util.*;

public class B_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] bur = new int[3];
        for (int i = 0; i < 3; ++i) {
            bur[i] = Integer.parseInt(br.readLine());
        }
        int mBur = Arrays.stream(bur).min().getAsInt();

        int[] sid = new int[2];
        for (int i = 0; i < 2; ++i) {
            sid[i] = Integer.parseInt(br.readLine());
        }

        int mSid = Arrays.stream(sid).min().getAsInt();

        System.out.println((mBur+mSid)-50);
    }
}
