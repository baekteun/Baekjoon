package B_2581

import java.io.*
import kotlin.system.exitProcess

val eratos = BooleanArray(10_001){false}
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    setEra()
    var x: Int = readLine().toInt()
    var y: Int = readLine().toInt()
    var res = 0
    var min = 0


    for (i in y downTo x){
        if(!eratos[i]) {
            res+=i
            min = i
        }
    }
    if(res==0){
        print(-1)
        exitProcess(0)
    }
    println(res)
    print(min)
}

fun setEra(){
    eratos[0] = true
    eratos[1] = true
    for (i in 1 until eratos.size){
        if(!eratos[i])
            for(k in i*i until eratos.size step i)
                eratos[k] = true
    }
}