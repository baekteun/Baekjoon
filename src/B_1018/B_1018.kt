package B_1018

import java.io.*
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n: Int
    val m: Int
    StringTokenizer(readLine()).let {
        n = it.nextToken().toInt()
        m = it.nextToken().toInt()
    }

    var res = Integer.MAX_VALUE
    val arr = arrayOfNulls<String>(n)
    repeat(n){
        arr[it] = readLine()
    }

    for (i in 0 until n-7){
        for (k in 0 until m-7){
            var index1 = 0
            var index2 = 0
            for (p in i until i+8){
                for (q in k until k+8){
                    if((p+q)%2==0){
                        if (arr[p]!![q] != 'W')
                            index1++
                        if(arr[p]!![q] != 'B')
                            index2++
                    }else{
                        if (arr[p]!![q] != 'B')
                            index1++
                        if(arr[p]!![q] != 'W')
                            index2++
                    }
                }
            }
            res = res.coerceAtMost(index1.coerceAtMost(index2))
        }
    }
    print(res)
}