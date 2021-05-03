import java.util.*
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var n = sc.next()
    val croatia = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    for (i in 0..7) {
        n = n.replace(croatia[i], "a")
    }
    println(n.length)
}
