package B_9095;

import java.io.*;

public class B_9095 {
    static int[] data=new int[13];
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        data[1]=1;
        data[2]=2;
        data[3]=4;
        while(N-->0){
            System.out.println(pn(Integer.parseInt(br.readLine())));
        }
    }
    static int pn(int x){
        if(data[x]==0){
            for(int i=4;i<=x; i++){
                data[i]=data[i-3]+data[i-2]+data[i-1];
            }
        }
        return data[x];
    }
}
