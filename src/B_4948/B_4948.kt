package B_4948

import java.io.*

val eratos = BooleanArray(246_913){false}
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    var n = readLine().toInt()
    val sb = StringBuilder()
    setEra()
    while(n!=0){
        var res = 0
        for (i in n+1..n*2)
            if(!eratos[i])
                res++
        sb.append(res).append('\n')

        n = readLine().toInt()
    }
    print(sb)
}
fun setEra(){
    eratos[0] = true
    eratos[1] = true
    for(i in 2..Math.sqrt(eratos.size.toDouble()).toInt())
        if(!eratos[i])
            for(k in i*i until eratos.size step i)
                eratos[k] = true
}