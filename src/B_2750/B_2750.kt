import java.util.*

fun main(args: Array<String>){
    var a= readLine()
    var arr= IntArray(a!!.toInt())
    for(i in 0 until a!!.toInt()){
        arr[i]= readLine()!!.toInt()
    }
    Arrays.sort(arr)
    for(i in 0 until a!!.toInt()){
        println(arr[i])
    }
}