package B_10845;

import java.io.*;
import java.util.*;

public class B_10845 {
    static Queue<Integer> q = new LinkedList<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        int pushN=0;
        for(int i=0; i<t; i++){
            String n=sc.next();
            switch (n){
                case "push":
                    pushN = sc.nextInt();
                    q.add(pushN);
                    break;
                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peek()).append('\n');
                    break;
                case "back":
                    sb.append(q.isEmpty() ? -1 : pushN).append('\n');
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "pop":
                    sb.append(q.isEmpty() ? -1 : q.poll()).append('\n');
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;

            }

        }
        System.out.println(sb);
    }

}
