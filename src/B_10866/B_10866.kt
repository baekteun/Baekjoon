package B_10866

import java.io.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    val q = ArrayDeque<Int>()
    repeat(readLine().toInt()){
        val n = readLine().split(" ")
        when(n[0]){
            "push_front" -> q.addFirst(n[1].toInt())
            "push_back" -> q.addLast(n[1].toInt())
            "pop_front" -> {
                if(!q.isEmpty())
                    sb.append(q.removeFirst())
                else
                    sb.append(-1)
                sb.append('\n')
            }
            "pop_back" -> {
                if(!q.isEmpty())
                    sb.append(q.removeLast())
                else
                    sb.append(-1)
                sb.append('\n')
            }
            "size" -> sb.append(q.size).append('\n')
            "empty" -> sb.append(when(q.isEmpty()){true -> 1 false -> 0}).append('\n')
            "front" -> {
                if(!q.isEmpty())
                    sb.append(q.first())
                else
                    sb.append(-1)
                sb.append('\n')
            }
            "back" -> {
                if(!q.isEmpty())
                    sb.append(q.last())
                else
                    sb.append(-1)
                sb.append('\n')
            }

        }
    }
    print(sb)
}