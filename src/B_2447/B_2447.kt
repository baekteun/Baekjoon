package B_2447

import java.io.*

lateinit var arr: Array<CharArray>
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    arr = Array(n) { CharArray(n) }
    star(0,0, n,false)
    val sb = StringBuilder()
    for (i in 0 until n){
        for (k in 0 until n){
            sb.append(arr[i][k])
        }
        sb.append('\n')
    }
    print(sb)

}
fun star(x: Int, y: Int, z: Int, blank: Boolean){
    if (blank) {
        for (i in x until x + z) {
            for (j in y until y + z) {
                arr[i][j] = ' '
            }
        }
        return
    }
    if(z==1){
        arr[x][y] = '*'
        return
    }
    val size: Int = z / 3
    var count = 0
    for(i in x until x+z step size){
        for(k in y until y+z step size){
            count++
            if(count==5)
                star(i,k, size, true)
            else
                star(i,k,size,false)
        }
    }
}