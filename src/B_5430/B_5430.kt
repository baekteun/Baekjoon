package B_5430

import java.io.*
import java.util.*


fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    repeat(readLine().toInt()){
        val command = readLine()
        val arrSize = readLine().toInt()
        var isR = false
        val input = readLine()
        val arr = input.substring(1, input.lastIndex).split(",")
        val q = ArrayDeque<Int>()
        if(arr[0]!="")
            for (i in arr)
                q.add(i.toInt())

        for (i in command.indices){
            when(command[i]){
                'R' -> isR = !isR
                'D' -> {

                    when(q.isEmpty()){
                        true -> {
                            sb.append("error").append('\n')
                            break
                        }
                        false ->  when (isR) {
                            true -> q.removeLast()
                            false -> q.removeFirst()
                        }
                    }
                }
            }
            if(i==command.lastIndex) {
                when (isR) {
                    false -> sb.append(q.toString().replace(" ", ""))
                    true -> sb.append(q.reversed().toString().replace(" ", ""))
                }
                sb.append('\n')
            }
        }

    }
    print(sb)
}



