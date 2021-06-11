package B_2749

import java.io.*

var fi:LongArray = LongArray(1_500_001)
fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    fi[0]=0
    fi[1]=1
    var n:Long = readLine().toLong()
    for(i in 2..1_500_000){
        fi[i] = (fi[(i-1)]+fi[(i-2)])%1_000_000
    }
    if(n >= 1_500_000)
        n%=1_500_000
    print(fi[n.toInt()])
}
