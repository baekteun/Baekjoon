package B_1158;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_1158 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int N=sc.nextInt();
        int K=sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++){
            q.offer(i);
        }
        while(q.size() != 1){
            for(int i=0; i<K-1; i++){
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");
        bw.write(sb.toString());
        bw.flush();
    }
}
