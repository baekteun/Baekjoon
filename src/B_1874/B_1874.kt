package B_1874


import java.util.*
fun main(args: Array<String>) {
    val sb = StringBuilder()
    val stack = Stack<Int>()
    var start=0
    readLine()?.let {
        repeat(it.toInt()){
            var n = readLine()?.toInt()
            if(n!! > start){
                for(i in start+1..n!!){
                    stack.push(i)
                    sb.append('+').append('\n')
                }
                start=n
            }
            else if(n != stack.peek()){
                print("NO")
                return
            }
            stack.pop()
            sb.append('-').append('\n')
        }
    }
    print(sb)
}
