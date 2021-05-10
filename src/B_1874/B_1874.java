package B_1874;

import java.io.*;
import java.util.Stack;


public class B_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int start=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            if(n>start){
                for(int k=start+1; k<=n; k++){
                    stack.push(k);
                    sb.append('+').append('\n');
                }
                start=n;
            }
            else if(stack.peek() != n){
                bw.write("NO");
                bw.flush();
                return;
            }

            stack.pop();
            sb.append('-').append('\n');

        }
        bw.write(sb.toString());
        bw.flush();

    }
}
