package B_10845
import java.util.*




    fun main(args: Array<String>) {
        var q: Queue<Int> = LinkedList()
        val sc = Scanner(System.`in`)
        val sb = StringBuilder()
        val t = sc.nextInt()
        var pushN = 0
        for (i in 0 until t) {
            val n = sc.next()
            when (n) {
                "push" -> {
                    pushN = sc.nextInt()
                    q.add(pushN)
                }
                "front" -> sb.append(if (q.isEmpty()) -1 else q.peek()).append('\n')
                "back" -> sb.append(if (q.isEmpty()) -1 else pushN).append('\n')
                "empty" -> sb.append(if (q.isEmpty()) 1 else 0).append('\n')
                "pop" -> sb.append(if (q.isEmpty()) -1 else q.poll()).append('\n')
                "size" -> sb.append(q.size).append('\n')
            }
        }
        println(sb)
    }

