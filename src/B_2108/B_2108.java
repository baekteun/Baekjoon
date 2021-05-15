package B_2108;
import java.util.*;
import java.io.*;

public class B_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        int sum=0;
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int[] countArr = new int[8001];
        for(int n : arr) {
            countArr[n+4000]++;
        }

        int[] ansArr = new int[num];
        int tempMax = 0, tempNum=0 , index=0;
        for(int i=0; i<countArr.length; i++) {
            tempNum = countArr[i];
            if(tempNum>0) {
                if(tempNum > tempMax) {
                    tempMax = tempNum;
                }

                while(tempNum>0) {
                    ansArr[index] = i-4000;
                    tempNum--;
                    index++;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int most;
        for(int i=0; i<countArr.length; i++) {
            if(countArr[i]==tempMax) {
                list.add(i-4000);
            }
        }

        if(list.size()>1) {
            most = list.get(1);
        } else {
            most = list.get(0);
        }

        bw.write((int)Math.round((double)sum/num)+"\n");
        bw.write(ansArr[ansArr.length/2]+"\n");
        bw.write(most+"\n");
        bw.write(ansArr[ansArr.length-1]-ansArr[0]+"\n");

        bw.flush();
    }
}
