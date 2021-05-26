package B_1463

import java.io.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val x = br.readLine().toInt()
    val arr = IntArray(x+1)
    arr[0]=0
    arr[1]=0
    for(i in 2..x){
        arr[i]=arr[i-1]+1
        if(i%3==0) arr[i]=Math.min(arr[i],arr[i/3]+1)
        if(i%2==0) arr[i]=Math.min(arr[i],arr[i/2]+1)
    }
    print(arr[x])
}