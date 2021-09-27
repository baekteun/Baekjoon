package B_1333;

import java.io.*;
import java.util.*;

public class B_1333 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        ArrayList<Boolean> enable = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            for(int j = 0; j < L; j++) {    //음악 n초 출력
                enable.add(true);
            }

            if(i != N-1) { // 마지막 곡이 아닐 경우
                for(int j = 0; j < 5; j++) {    // 음악과 음악 사이 5초
                    enable.add(false);
                }
            }
        }
        int res = 0;
        while(res < enable.size()) {    //벨이 울리는 주기에 따라 해당 sec를 확인하여 음악이 나오지 않는중(false)이면 해당 sec를 출력
            if(!enable.get(res)) {
                break;
            }
            res += D;
        }
        System.out.println(res);
    }
}
