package B_11727
import java.io.*
var d = IntArray(1001)
fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    print(tile(br.readLine().toInt()))
}
fun tile(x: Int):Int{
    if(x==1) return 1
    if(x==2) return 3
    if(d[x]!=0) return d[x]
    d[x] = (tile(x-1)+2*tile(x-2))%10007
    return d[x]
}