package B_10815;

import java.util.*;
import java.io.*;

public class B_10815{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] card1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; ++i){
            card1[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] card2 = new int[M];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; ++i){
            card2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card1);
        for(int i=0; i<M; ++i){
            boolean find = false;
            int start = 0;
            int end = N-1;
            while(start <= end){
                int mid = (start+end)/2;

                if(card2[i] > card1[mid]){
                    start = mid + 1;
                }else if(card2[i] < card1[mid]){
                    end = mid -1;
                }else{
                    find = true;
                    break;
                }

            }
            sb.append(find ? 1 : 0).append(" ");
        }
        System.out.print(sb);
    }
}