package B_2292

import java.io.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    readLine().toInt().let {
        when(it){
            1 -> print(1)
            else -> {
                var s = 2
                var count = 0
                while(it>=s){
                    s += 6*(count++)
                }
                print(count)
            }
        }
    }
}