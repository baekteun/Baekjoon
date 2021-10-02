package B_1837

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine())
    val n = st.nextToken()
    val k = st.nextToken().toInt()
    val isPrime: BooleanArray = BooleanArray(1_000_000){false}
    var good = true
    var res = 0
    for(i in 2 until k){

        if (!isPrime[i]){
            if (isGood(i,n)){
                good = false
                res = i
                break
            }
            for(m in 2*i until k step i) isPrime[m] = true
        }
    }
    print(when(good){
        true -> "GOOD"
        false -> "BAD $res"
    })

}
fun isGood(x: Int, y: String): Boolean {
    var res = 0
    for(i in y){
        res = ((res*10)+(i-'0'))%x
    }
    return res==0
}