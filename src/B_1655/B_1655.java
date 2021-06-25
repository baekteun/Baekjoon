package B_1655;

import java.util.*;
import java.io.*;

public class B_1655{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> minq = new PriorityQueue<>();
        PriorityQueue<Integer> maxq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; ++i){
            int value = Integer.parseInt(br.readLine());
            if(maxq.size() == minq.size()){
                maxq.add(value);
            }else{
                minq.add(value);
            }

            if(!minq.isEmpty() && !maxq.isEmpty() && maxq.peek() > minq.peek()){
                int temp = minq.poll();
                minq.add(maxq.poll());
                maxq.add(temp);
            }

            sb.append(maxq.peek()).append('\n');


        }
        System.out.print(sb);

    }
}