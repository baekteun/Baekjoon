package B_11948

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val arr1 = ArrayList<Int>()
    repeat(4){
        arr1.add(readLine().toInt())
    }
    val arr2 = ArrayList<Int>()
    repeat(2){
        arr2.add(readLine().toInt())
    }
    arr1.sort()
    arr2.sort()
    arr1.removeAt(0)
    arr2.removeAt(0)
    println(
        arr1.sum()+arr2.sum()
    )
}