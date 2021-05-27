package B_9095

import java.io.*

var data = IntArray(12)
fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var N = br.readLine().toInt()
    data[1]=1
    data[2]=2
    data[3]=4
    while(N-->0){
        println(pn(br.readLine().toInt()))
    }
}
fun pn(x: Int): Int{
    if(data[x]==0) {
        for (i in 4..x) {
            data[i] = data[i - 1] + data[i - 2] + data[i - 3]
        }
    }
    return data[x]
}