package B_2775

import java.io.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    val arr = Array<IntArray>(15) { IntArray(15)}
    for(i in 1..14){
        arr[i][1] = 1
        arr[0][i] = i
    }

    repeat(readLine().toInt()){
        val K = readLine().toInt()
        val N = readLine().toInt()
        for(i in 1..K){
            for(k in 2..N){
                if(arr[i][k]!=0) continue
                arr[i][k] = arr[i][k-1] + arr[i-1][k]
            }
        }
        sb.append(arr[K][N]).append('\n')
    }
    print(sb)
}