package B_7568

import java.io.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val arr = ArrayList<Person>()
    val sb = StringBuilder()
    repeat(n){
        val st = readLine().split(" ")
        arr.add(Person(st[0].toInt(), st[1].toInt()))
    }
    for (i in 0 until n){
        var rank = 1
        for (k in 0 until n){
            if(i==k) continue

            if(arr[i].height < arr[k].height && arr[i].weight < arr[k].weight)
                rank++

        }
        sb.append("$rank ")
    }
    print(sb)
}


data class Person(var weight: Int, var height: Int){}