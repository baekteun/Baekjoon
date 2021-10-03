package B_2869

import java.io.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val st = readLine().split(" ")
    val res: Double = ((st[2].toInt()-st[0].toInt()).toDouble()/(st[0].toInt()-st[1].toInt()))
    print(Math.ceil(res).toInt()+1)
}