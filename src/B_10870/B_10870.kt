package B_10870

import java.io.*

var fibo = IntArray(100)
fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    fibo[0]=0
    fibo[1]=1
    var N: Int = readLine().toInt()
    print(fib(N))
}
fun fib(x: Int): Int {
    if(x==0) return 0
    if(fibo[x]!=0) return fibo[x]
    fibo[x] = fib(x-1)+fib(x-2)
    return fibo[x]
}