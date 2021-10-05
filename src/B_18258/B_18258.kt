package B_18258

import java.io.*
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val q = LinkedList<Int>()
    val sb = StringBuilder()
    repeat(readLine().toInt()){
        val command = readLine().split(" ")
        when(command[0]){
            "push" -> q.add(command[1].toInt())
            "pop" -> {
                if(!q.isEmpty())
                    sb.append(q.pop())
                else
                    sb.append(-1)
                sb.append('\n')
            }
            "size" -> sb.append(q.size).append('\n')
            "empty" -> sb.append(when(q.isEmpty()){ true -> 1; false -> 0}).append('\n')
            "front" -> {
                if(!q.isEmpty())
                    sb.append(q.peek())
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