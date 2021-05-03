package B_2941;

import java.util.Scanner;

public class B_2941 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n=sc.next();
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i=0; i<8; i++){
            n = n.replace(croatia[i],"a");
        }
        System.out.println(n.length());
    }
}