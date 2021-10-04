package B_9020

import java.io.*

val eratos = BooleanArray(10_000){false}
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    setEra()
    val sb = StringBuilder()
    repeat(readLine().toInt()){
        val goal: Int = readLine().toInt()
        var p = goal/2
        var q = goal/2
        while (true){
            if(!eratos[p] && !eratos[q]){
                sb.append(p).append(" ").append(q).append('\n')
                break
            }
            p--
            q++
        }
    }
    print(sb)
}
fun setEra(){
    eratos[0] = true
    eratos[1] = true
    for (i in 2 until Math.sqrt(eratos.size.toDouble()).toInt())
        if(!eratos[i])
            for (k in i*i until eratos.size step i)
                eratos[k] = true

}