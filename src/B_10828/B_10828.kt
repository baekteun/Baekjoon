package B_10828

import java.io.*;
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stack = Stack<Int>()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat (readLine().toInt()) {
        val input = readLine().split(" ")

        when(input[0]) {
            "push" -> stack.push(input[1].toInt())
            "pop" -> bw.write("${if (stack.empty()) -1 else stack.pop()}\n")
            "size" -> bw.write("${stack.size}\n")
            "empty" -> bw.write("${if (stack.empty()) 1 else 0}\n")
            "top" -> bw.write("${if (stack.empty()) -1 else stack.peek()}\n")
        }
    }
    bw.flush()
}