package B_10773;

import java.io.*;
import java.util.LinkedList;
import java.util.Stack;

public class B_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int res=0,n=Integer.parseInt(br.readLine());
        for(int i=0; i< n;i++){
            int in = Integer.parseInt(br.readLine());
            if(in == 0){
                res-=stack.pop();
            }
            else{
                stack.push(in);
                res+=in;
            }
        }
        System.out.println(res);
    }
}
